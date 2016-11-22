package com.jamosolutions.automator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.jamosolutions.JamoAutomator.domain.AppVersion;
import com.jamosolutions.automator.domain.Credentials;

@Mojo(name = "upload")
public class JamoUploadMojo extends AbstractMojo {
	@Parameter(defaultValue = "${app.groupId}")
	private String groupId;
	@Parameter(defaultValue = "${app.artifactId}")
	private String artifactId;
	@Parameter(defaultValue = "${app.version}")
	private String version;
	@Parameter(defaultValue = "${app.type}")
	private String type;

	public void execute() throws MojoExecutionException {
		File repoFolder = new File(System.getenv("M2_REPO"));
		if (!repoFolder.exists()) {
			getLog().error("please set the M2_REPO environment variable");
		} else {
			File artifactFile = new File(System.getenv("M2_REPO"), groupId.replace('.', '/') + "/" + artifactId + "/" + version + "/" + artifactId + "-"
					+ version + "." + type);
			getLog().info("" + artifactFile.exists());
			getLog().info("" + artifactFile.length());
			Credentials credentials = new Credentials();
			credentials.setAccount("SAM");
			credentials.setUsername("sammartens@gmail.com");
			credentials.setPassword("mas");
			AppVersion appVersion = getLatestAppVersion(groupId + "." + artifactId, credentials);
			getLog().info(appVersion.getDeveloperVersion());
		}
		getLog().info(groupId);
		getLog().info(System.getenv("M2_REPO"));
		getLog().info("uploading file....");
	}

	private AppVersion getLatestAppVersion(String appPackage, Credentials credentials) throws MojoExecutionException {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setMessageConverters(getMessageConverters());
		//TODO change hard coded url
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://10.32.153.224/rest/integration/latestAppVersion")
				.queryParam("username", credentials.getUsername()).queryParam("password", credentials.getPassword())
				.queryParam("account", credentials.getAccount()).queryParam("appPackage", appPackage);
		AppVersion result = restTemplate.getForObject(builder.build().encode().toUri(), AppVersion.class);
		return result;
	}

	private static List<HttpMessageConverter<?>> getMessageConverters() {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingJackson2HttpMessageConverter());
		return converters;
	}
}