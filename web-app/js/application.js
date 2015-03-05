// 
//  application.js
//
//  * Copyright (C) <2015> <First Utility>
//  *
//  * This software may be modified and distributed under the terms
//  * of the MIT license.  See the LICENSE file for details.
//

if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
		$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}
