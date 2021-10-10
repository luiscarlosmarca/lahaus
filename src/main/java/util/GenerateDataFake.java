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

    public static GenerateDataFake generateTo() {
        return new GenerateDataFake();
    }

    public String ajob(){
        return faker.superhero().name();
    }
    public String aName(){
       return faker.gameOfThrones().dragon();
    }




}
