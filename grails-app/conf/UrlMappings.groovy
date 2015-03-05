/* UrlMappings.groovy 
*
* Copyright (C) <2015> <First Utility>
*
* This software may be modified and distributed under the terms
* of the MIT license.  See the LICENSE file for details.
*/


class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		
		"/site" ( controller : 'switchingSite') {
			action = [ GET: "site" ]
		}
		
		"/supplydetails" ( controller : 'switchingSite') {
			action = [ POST: "supplyDetails" ]
		}
		
		
		"/requestshare" ( controller : 'switchingSite') {
			action = [ GET: "redirectToSignIn" ]
		}
		
		"/callback" ( controller : 'switchingSite') {
			action = [ GET: "callback" ]
		}		

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
