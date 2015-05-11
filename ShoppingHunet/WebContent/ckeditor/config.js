/**
 * @license Copyright (c) 2003-2014, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	
	 config.language = 'ko';
	 config.uiColor = "#F0F0F0";
	 
	 config.enterMode = CKEDITOR.ENTER_BR;
	 config.shiftEnterMode = CKEDITOR.ENTER_P;
	 config.startupFocus = true;
	 config.font_defaultLabel = 'Gulim';
	 config.font_names = 'Gulim/Gulim;Dotum/Dotum;Batang/Batang;Gungsuh/Gungsuh;';
	 config.fontSize_defaultLabel = '12px';
	 
	 //CKFINDER
	 config.filebrowserBrowseUrl = '/ckfinder/ckfinder.html';
	 config.filebrowserImageBrowseUrl = '/ckfinder/ckfinder.html?type=Images';
	 config.filebrowserFlashBrowseUrl = '/ckfinder/ckfinder.html?type=Flash';
	 config.filebrowserUploadUrl = '/ckfinder/core/connector/jsva/connector.java?command=QuickUpload&type=Files';
	 config.filebrowserImageUploadUrl ='/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images';
	 config.filebrowserFlashUploadUrl ='/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash';
	 config.toolbar ='User';
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
};
