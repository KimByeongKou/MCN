package org.eney.util;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {
	
	public static void main(String[] args) throws IOException {
 
		//Document doc = Jsoup.connect("http://blog.acronym.co.kr").get();
		Document doc = Jsoup.connect("https://www.instagram.com/exidofficial/").get();
		System.out.println(doc.toString());
		Elements titles = doc.select(".react-root");
 
		
		//print all titles in main page
		for(Element e: titles){
			System.out.println("text: " +e.text());
			System.out.println("html: "+ e.html());
		}	
 
		//print all available links on page
		Elements links = doc.select("div[class]");
		for(Element l: links){
			System.out.println("link: " +l.attr("abs:href"));
		}
 
	}
	

}
