package amazon.chakri.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public void landingPage() {

		driver.get("https://www.amazon.in/b/ref=surl_fashion/?_encoding=UTF8&node=6648217031&pd_rd_w=e6MPI&content-id=amzn1.sym.4a33b274-4a92-4677-9316-870f15d40ae0&pf_rd_p=4a33b274-4a92-4677-9316-870f15d40ae0&pf_rd_r=6JPKGZGD2FWC45F0ECY1&pd_rd_wg=ljYTz&pd_rd_r=c94d3b85-c6dd-4050-86dc-18cbd722cf00&ref_=pd_hp_d_hero_unk");
		
	}
}
