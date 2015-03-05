package com.firstutility.midatatesttool

import com.sun.org.apache.bcel.internal.generic.RETURN;

import grails.plugins.rest.client.RestBuilder

class SupplyDetailsService {
	
	
	def grailsApplication
	
	def serviceMethod(String accessToken) {
		def authHeader = "Bearer " + accessToken
		def rest = new RestBuilder()			
		def uri = grailsApplication.config.resource.baseUrl
		def resp = rest.get(uri) {
			 accept "application/json"
			 header "AUTHORIZATION", authHeader }
		return resp.text
	}		
}
