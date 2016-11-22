package com.jamosolutions.JamoAutomator.domain;

import java.io.Serializable;

public class UsersCredentialsInfo implements Serializable {
	//	private class CredentialsInfo {
	String username;
	String password;

	public UsersCredentialsInfo(User user) {
		this.username = user.getName();
		this.password = user.getPassword();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/*	}
	
		private List<CredentialsInfo> credentialsInfosList = new ArrayList<>();
	
		public void add(String username, String password) {
			credentialsInfosList.add(new CredentialsInfo(username, password));
		}
	
		public void add(User user) {
			credentialsInfosList.add(new CredentialsInfo(user.getName(), user.getPassword()));
		}
	
		public void addAll(List<User> users) {
			for (User user : users) {
				CredentialsInfo credentialsInfo = new CredentialsInfo(user.getName(), user.getPassword());
				if (!credentialsInfosList.contains(credentialsInfo)) {
					credentialsInfosList.add(credentialsInfo);
				}
			}
		}
	
		public List<CredentialsInfo> getCredentialsInfos() {
			return credentialsInfosList;
		}
	
		public void setCredentialsInfos(List<CredentialsInfo> credentialsInfos) {
			credentialsInfosList = credentialsInfos;
		}*/
}
