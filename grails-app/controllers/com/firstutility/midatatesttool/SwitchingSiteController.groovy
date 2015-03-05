/* SwitchingSiteController.groovy 
*
* Copyright (C) <2015> <First Utility>
*
* This software may be modified and distributed under the terms
* of the MIT license.  See the LICENSE file for details.
*/

package com.firstutility.midatatesttool

class SwitchingSiteController {

	def supplyDetailsService
	
	def index() {
	}

	def supplyDetails(){
		def respString = supplyDetailsService.serviceMethod(params.access_token)
		render "supply details from server [ " + respString + " ]"
	}

	def site() {
	}

	def callback() {
		render(view: "callback")
	}

	def redirectToSignIn() {
		def signInUri = buildSignInUri()
		redirect(url: signInUri)
	}

	def private buildSignInUri() {
		def signInUri = grailsApplication.config.oauth.baseUrl +
				"api/oauth/authorize?" +
				"client_id=" +
				grailsApplication.config.oauth.clientId +
				"&response_type=token&" +
				"redirect_uri=" +
				grailsApplication.config.oauth.redirectUri +
				"&scope=" +
				grailsApplication.config.oauth.scope
		return signInUri
	}
}
