package com.hand.ssm.dto;

import java.text.SimpleDateFormat;

public class Customer {

	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String username;
	private String password;
	private int addressId;
	private String createDate;
	private int storeId;
	private int active;
	private int cityId;
	private String phone;
	private String district;
	private String address2;
	private String postalCode;
	

	//	对于时间戳类型，dto应该用什么类型进行接收
	private String lastUpdate;
	private String lastUpdate2;
	

	private int cursor;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getCursor() {
		return cursor;
	}

	public void setCursor(int cursor) {
		this.cursor = cursor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String cd) {
		this.createDate = cd;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + ", username=" + username + ", password=" + password + ", addressId="
				+ addressId + ", createDate=" + createDate + ", storeId=" + storeId + ", active=" + active
				+ ", lastUpdate=" + lastUpdate + ", cursor=" + cursor + "]";
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getLastUpdate2() {
		return lastUpdate2;
	}

	public void setLastUpdate2(String lastUpdate2) {
		this.lastUpdate2 = lastUpdate2;
	}
	
}
