package com.jamosolutions.automator;

import java.io.File;
import java.util.Locale;

import org.apache.maven.doxia.siterenderer.Renderer;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.reporting.AbstractMavenReport;
import org.apache.maven.reporting.MavenReportException;

@Mojo(name = "run2")
public class JamoAutomatorReportMojo extends AbstractMavenReport {
	//https://github.com/yandex-qatools/tests-report-example/blob/master/tests-report-plugin/src/main/java/ru/yandex/qatools/examples/report/ScreenShotDifferReport.java
	@Component
	private PluginDescriptor pluginDescriptor;
	@Parameter(defaultValue = "${project.basedir}")
	private File baseDir;
	@Parameter(defaultValue = "${project}", required = true)
	private MavenProject mavenProject;
	@Component
	private Renderer siteRenderer;

	protected File getReportDirectory() {
		return new File(baseDir.getAbsolutePath(), "target/site/jamoautomator");
	}

	@Override
	protected String getOutputDirectory() {
		return getReportDirectory().getAbsolutePath();
	}

	@Override
	protected Renderer getSiteRenderer() {
		return siteRenderer;
	}

	@Override
	protected MavenProject getProject() {
		return mavenProject;
	}

	public String getDescription(Locale arg0) {
		return "Jamo Automator Report Description";
	}

	public String getName(Locale arg0) {
		return "Jamo Automator Report";
	}

	public String getOutputName() {
		return pluginDescriptor.getArtifactId();
	}

	@Override
	protected void executeReport(Locale arg0) throws MavenReportException {
		// TODO Auto-generated method stub
		System.out.println("asdfasdfasdfas");
	}
}