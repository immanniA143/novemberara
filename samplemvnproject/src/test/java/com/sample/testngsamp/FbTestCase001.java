package com.sample.testngsamp;

import com.project.samplemvnproject.FbBase;

public class FbTestCase001 extends FbBase {

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigateToUrl("FBURL");
		fbLogIn("fbuserid_id","fbpass_id","fbloginbutton_xpath");
		}
}
