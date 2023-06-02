package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class users {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userid;
		private String username;
		private String password;
		private String role;
		@Override
		public String toString() {
			return "users [userid=" + userid + ", username=" + username + ", password=" + password + ", role=" + role
					+ ", enabled=" + enabled + ", name=" + name + ", useremail=" + useremail + ", contactno="
					+ contactno + ", adress=" + adress + ", pincode=" + pincode + "]";
		}
		public users(int userid, String username, String password, String role, Boolean enabled, String name,
				String useremail, String contactno, String adress, String pincode) {
			super();
			this.userid = userid;
			this.username = username;
			this.password = password;
			this.role = role;
			this.enabled = enabled;
			this.name = name;
			this.useremail = useremail;
			this.contactno = contactno;
			this.adress = adress;
			this.pincode = pincode;
		}
		public users() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
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
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public Boolean getEnabled() {
			return enabled;
		}
		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUseremail() {
			return useremail;
		}
		public void setUseremail(String useremail) {
			this.useremail = useremail;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		private Boolean enabled;
		private String name;
		private String useremail;
		private String contactno; 
		private String adress;
		private String pincode;
}
