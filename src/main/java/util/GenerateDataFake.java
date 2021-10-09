package util;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.datatransfer.Clipboard;

import static util.Constants.*;

public class GenerateDataFake {

    final Faker faker = new Faker(Locale.ENGLISH);
    public static String tmp_sms = "";
    public static GenerateDataFake generateTo() {
        return new GenerateDataFake();
    }

    public String aPassword(){
        return faker.gameOfThrones().city()+"123456";

    }
    public String aEmail(){
        String str= faker.dune().title().trim()+"@"+(faker.funnyName().name()).trim()+".com";
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
        return noSpaceStr;

    }




}
