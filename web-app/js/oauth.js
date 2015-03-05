// 
//  oauth.js
//
//  * Copyright (C) <2015> <First Utility>
//  *
//  * This software may be modified and distributed under the terms
//  * of the MIT license.  See the LICENSE file for details.
//

$(document).ready(function() {var params = {}, queryString = location.hash
						.substring(1), regex = /([^&=]+)=([^&]*)/g, m, html = '';

				while (m = regex.exec(queryString)) {
						params[decodeURIComponent(m[1])] = decodeURIComponent(m[2]);
					}					
					document.getElementById('access_token').value = params.access_token
				});
