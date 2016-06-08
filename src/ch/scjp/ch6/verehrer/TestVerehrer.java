package ch.scjp.ch6.verehrer;

import ch.java_akademie.tools.MyTools;

public class TestVerehrer
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("-----------------------------------");
		System.out.println("Test der Klassen Dame/Herr/Verehrer");
		System.out.println("-----------------------------------");

		Herr max = new Herr("max");
		Herr moritz = new Herr("moritz");
		Herr fritz = new Herr("fritz");
		Herr hans = new Herr("hans");

		Dame dame = new Dame("angelika");

		dame.addVerehrer(max);
		dame.addVerehrer(moritz);
		dame.addVerehrer(fritz);
		dame.addVerehrer(hans);

		dame.life();

		MyTools.pause();
	}
}
