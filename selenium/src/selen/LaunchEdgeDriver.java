package selen;


import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./selenium/msedgedriver.exe");
		EdgeDriver ref=new EdgeDriver();

	}

}
