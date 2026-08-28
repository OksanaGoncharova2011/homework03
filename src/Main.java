//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    var dog = 8.0;
    var cat = 3.6 ;
    var paper = 763789 ;
    System.out.println( "dog" );
    System.out.println( "cat" );
    System.out.println("paper" );
    System.out.println( dog );
    System.out.println( cat );
    System.out.println( paper );

    var bigDog = dog + 4;
    var bigCat = cat + 4 ;
    var bigPaper = paper + 4 ;
    System.out.println( bigDog );
    System.out.println( bigCat );
    System.out.println( bigPaper );

    var smallDog = bigDog - 3.5;
    var smallCat = bigCat - 1.6 ;
    var smallPaper = bigPaper - 7639 ;
    System.out.println( smallDog );
    System.out.println( smallCat );
    System.out.println( smallPaper );


    var friend = 19 ;
    var bigFriend = friend + 2 ;
    var smallFriend = bigFriend  / 7 ;
    System.out.println( friend );
    System.out.println( bigFriend );
    System.out.println( smallFriend );

    var frog = 3.5 ;
    var bigFrog =  frog * 10 ;
    var smallFrog = bigFrog / 3.5 ;
    var frogBig = smallFrog + 4 ;
    System.out.println( frog );
    System.out.println( bigFrog );
    System.out.println( smallFrog );
    System.out.println( frogBig );

    var bokser = 78.2 ;
    var bokser2 = 82.7 ;
    var resultBokser = bokser + bokser2 ;
    System.out.println( " общая масса двух бойцов " + resultBokser + " кг! " );


    var resultBokser2 = bokser2 - bokser ;
    System.out.println( " разниц между массами бойцов " + resultBokser2 + " кг! " );

    var resultBokser3 = bokser2 % bokser ;
    System.out.println( " остаток " + resultBokser3 + " кг! " );

    var allHour = 640 ;
    var hour = 8 ;
    var man = allHour / hour ;
    System.out.println( " Всего работников в компании — " + man + " человек " );

    var men = man + 94 ;
    var result13 = man * hour ;
    System.out.println( " Если в компании работает " + men + " человек, то всего "+ result13 + " часов работы может быть поделено между сотрудниками. " );



}


