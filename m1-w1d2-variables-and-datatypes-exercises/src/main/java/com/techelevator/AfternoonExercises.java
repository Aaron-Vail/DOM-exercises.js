package com.techelevator;

public class AfternoonExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 1. 4 birds are sitting on a branch. 1 flies away. How many birds are
		 * left on the branch?
		 */
		String branch = " Birds on branch";
		int birdsOnBranch = 4 - 1;
		System.out.println(birdsOnBranch + branch);
		/*
		 * 2. There are 6 birds and 3 nests. How many more birds are there than
		 * nests?
		 */
		String nestedBirds = " Birds in nest";
		int birdsTotal = 6;
		int birdsInNest = 3;
		System.out.println(birdsTotal - birdsInNest + nestedBirds);

		/*
		 * 3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
		 * many raccoons are left in the woods?
		 */
		String racoonsInWoods = " Racoon in the woods.";
		int racoonsEating = 2;
		int racoonsPlaying = 3;
		System.out.println(racoonsPlaying - racoonsEating + racoonsInWoods);
		/*
		 * 4. There are 5 flowers and 3 bees. How many less bees than flowers?
		 */
		String flowersWithoutBees = " Flowers without bees.";
		int bees = 3;
		int flowers = 5;
		System.out.println(flowers - bees + flowersWithoutBees);
		/*
		 * 5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
		 * breadcrumbs, too. How many pigeons are eating breadcrumbs now?
		 */
		String pigeonsEating = " Pigeon's eating breadcrumbs.";
		int pigeonEating = 1;
		System.out.println(pigeonEating + 1 + pigeonsEating);
		/*
		 * 6. 3 owls were sitting on the fence. 2 more owls joined them. How
		 * many owls are on the fence now?
		 */
		String owlsOnTheFence = " Owls on the fence.";
		int owls = 3;
		System.out.println(owls + 2 + owlsOnTheFence);
		/*
		 * 7. 2 beavers were working on their home. 1 went for a swim. How many
		 * beavers are still working on their home?
		 */
		String beaversWorking = " Beavers working on their home.";
		int beaversSwimming = 1;
		int beaversInHome = 2;
		System.out.println(beaversInHome - beaversSwimming + beaversWorking);
		/*
		 * 8. 2 toucans are sitting on a tree limb. 1 more toucan joins them.
		 * How many toucans in all?
		 */
		String toucans = " Toucans";
		int toucansInTree = 2;
		System.out.println(toucansInTree + 1 + toucans);
		/*
		 * 9. There are 4 squirrels in a tree with 2 nuts. How many more
		 * squirrels are there than nuts?
		 */
		String squirrelsWithoutNuts = " Squirrels without nuts.";
		int squirrels = 4;
		int nuts = 2;
		System.out.println(squirrels - nuts + squirrelsWithoutNuts);
		/*
		 * 10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money
		 * did she find?
		 */
		String mrsHilt = "Mrs. Hilt has ";
		String pennies = " cents";
		int quarter = 25;
		int dime = 10;
		int nickel = 05;
		int sum = quarter + dime + nickel + nickel;
		System.out.println(mrsHilt + sum + pennies);
		/*
		 * 11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs.
		 * Brier's class bakes 18 muffins, Mrs. MacAdams's class bakes 20
		 * muffins, and Mrs. Flannery's class bakes 17 muffins. How many muffins
		 * does first grade bake in all?
		 */
		String elementaryBake = "First Grade Muffings Baked: ";
		int brier = 18;
		int macadams = 20;
		int flannery = 17;
		int hilt = 0;
		int bakesalesum = brier + macadams + flannery + hilt;
		System.out.println(elementaryBake + bakesalesum);
		/*
		 * 12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents.
		 * How much did she spend in all for the two toys?
		 */
		String toyTotal = "Toy total: ";
		int yoyo = 24;
		int whistle = 14;
		int toyStoreTotal = yoyo + whistle;
		System.out.println(toyTotal + toyStoreTotal + pennies);
		/*
		 * 13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large
		 * marshmallows and 10 mini marshmallows.How many marshmallows did she
		 * use altogether?
		 */
		int marshmallows = 8;
		int miniMarshmallows = 10;
		int krispies = marshmallows + miniMarshmallows;
		System.out.println(krispies);
		/*
		 * 14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
		 * Elementary School received 17 inches of snow. How much more snow did
		 * Mrs. Hilt's house have?
		 */
		int schoolSnow = 17;
		int hiltSnow = 29;
		int snowSum = hiltSnow - schoolSnow;
		System.out.println(snowSum);
		/*
		 * 15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a
		 * pencil case. How much money does she have left?
		 */
		int hiltMoney = 10;
		int toyTruck = 3;
		int pencilCase = 2;
		int schoolBudget = hiltMoney - toyTruck - pencilCase;
		System.out.println(schoolBudget);
		/*
		 * 16. Josh had 16 marbles in his collection. He lost 7 marbles. How
		 * many marbles does he have now?
		 */
		String joshMarbles = "Joshs Marbles:";
		int jMarbles = 16;
		int lostMarbles = 7;
		int marblesGone = jMarbles - lostMarbles;
		System.out.println(joshMarbles + marblesGone);
		/*
		 * 17. Megan has 19 seashells. How many more seashells does she need to
		 * find to have 25 seashells in her collection?
		 */
		int meganShells = 19;
		int shellDifference = 25 - meganShells;
		System.out.println(shellDifference);
		/*
		 * 18. Brad has 17 balloons. 8 balloons are red and the rest are green.
		 * How many green balloons does Brad have?
		 */
		int redBalloons = 8;
		int greenBalloons = 17 - redBalloons;
		System.out.println(greenBalloons);
		/*
		 * 19. There are 38 books on the shelf. Marta put 10 more books on the
		 * shelf. How many books are on the shelf now?
		 */
		int booksOnShelf = 38;
		int newBooks = 10;
		int totalBooks = newBooks + booksOnShelf;
		System.out.println(totalBooks);
		/*
		 * 20. A bee has 6 legs. How many legs do 8 bees have?
		 */
		int beeLegs = 6;
		int totalBeeLegs = beeLegs * 8;
		System.out.println(totalBeeLegs);
		/*
		 * 21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2
		 * ice cream cones cost?
		 */
		int iceCream = 99;
		System.out.println(iceCream * 2 + " cents");
		/*
		 * 22. Mrs. Hilt wants to make a border around her garden. She needs 125
		 * rocks to complete the border. She has 64 rocks. How many more rocks
		 * does she need to complete the border?
		 */
		int completeBorder = 125;
		int hiltRocks = 64;
		int rockDifference = completeBorder - hiltRocks;
		System.out.println(rockDifference);
		/*
		 * 23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles
		 * does she have left?
		 */
		int hiltMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltMarblesLeft = hiltMarbles - hiltLostMarbles;
		System.out.println(hiltMarblesLeft + " marbles");
		/*
		 * 24. Mrs. Hilt and her sister drove to a concert 78 miles away. They
		 * drove 32 miles and then stopped for gas. How many miles did they have
		 * left to drive?
		 */
		int tripTotal = 78;
		int milesDriven = 32;
		int milesLeft = tripTotal - milesDriven;
		System.out.println(milesLeft + " miles left");
		/*
		 * 25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
		 * morning and 45 minutes shoveling snow on Saturday afternoon. How much
		 * total time did she spend shoveling snow?
		 */
		int morningShoveling = 90;
		int afternoonShoveling = 45;
		int totalShoveling = morningShoveling + afternoonShoveling;
		System.out.println(totalShoveling + " minutes shoveling");
		/*
		 * 26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
		 * money did she pay for all of the hot dogs?
		 */
		int hotDog = 50;
		int hotDogCost = hotDog * 6;
		System.out.println(hotDogCost + " cents");
		/*
		 * 27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils
		 * can she buy with the money she has?
		 */
		int pencilCost = 7;
		int hiltCash = 50;
		int pencilsBought = hiltCash / pencilCost;
		System.out.println(pencilsBought + " Pencils");
		/*
		 * 28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red
		 * and others were orange. If 20 of the butterflies were orange, how
		 * many of them were red?
		 */
		int orangeButterflies = 20;
		int totalButterflies = 33;
		int redButterflies = totalButterflies - orangeButterflies;
		System.out.println(redButterflies + " red butterflies");
		/*
		 * 29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much
		 * change should Kate get back?
		 */
		int kateMoney = 100;
		int candyCost = 54;
		int candyChange = kateMoney - candyCost;
		System.out.println(candyChange + pennies);
		/*
		 * 30. Mark has 13 trees in his backyard. If he plants 12 more, how many
		 * trees will he have?
		 */
		int markTrees = 13;
		int plantedTrees = 12;
		int yardTrees = markTrees + plantedTrees;
		System.out.println(yardTrees + " trees");
		/*
		 * 31. Joy will see her grandma in two days. How many hours until she
		 * sees her?
		 */
		int dayHours = 24;
		int dayCountdown = dayHours * 2;
		System.out.println(dayCountdown + " " + "hours");
		/*
		 * 32. Kim has 4 cousins. She wants to give each one 5 pieces of gum.
		 * How much gum will she need?
		 */
		int kimCousins = 4;
		int gumNeeded = kimCousins * 5;
		System.out.println(gumNeeded + " " + "pieces");
		/*
		 * 33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
		 * left?
		 */
		int danMoneyTotal = 3;
		int candyBar = 1;
		int danMoney = danMoneyTotal - candyBar;
		System.out.println("$" + danMoney);
		/*
		 * 34. 5 boats are in the lake. Each boat has 3 people. How many people
		 * are on boats in the lake?
		 */
		int boats = 3;
		int lakeBoats = 5;
		int boatPeople = boats * lakeBoats;
		System.out.println(boatPeople + " " + "people on the lake");
		/*
		 * 35. Ellen had 380 legos, but she lost 57 of them. How many legos does
		 * she have now?
		 */
		int legoTotal = 380;
		int lostLegos = 57;
		int legosLeft = legoTotal - lostLegos;
		System.out.println(legosLeft + " " + "legos");
		/*
		 * 36. Arthur baked 35 muffins. How many more muffins does Arthur have
		 * to bake to have 83 muffins?
		 */
		int bakedMuffins = 35;
		int totalMuffins = 83;
		int neededMuffins = totalMuffins - bakedMuffins;
		System.out.println(neededMuffins + " " + "muffins");
		/*
		 * 37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
		 * crayons does Willy have then Lucy?
		 */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int crayonDifference = willyCrayons - lucyCrayons;
		System.out.println(crayonDifference + " " + "crayons");
		/*
		 * 38. There are 10 stickers on a page. If you have 22 pages of
		 * stickers, how many stickers do you have?
		 */
		int stickerPage = 10;
		int stickerTotal = stickerPage * 22;
		System.out.println(stickerTotal + " " + "stickers");
		/*
		 * 39. There are 96 cupcakes for 8 children to share. How much will each
		 * person get if they share the cupcakes equally?
		 */
		int cupcakeTotal = 96;
		int children = 8;
		int sharedCupcakes = cupcakeTotal / children;
		System.out.println(sharedCupcakes + " " + "per child");
		/*
		 * 40. She made 47 gingerbread cookies which she will distribute equally
		 * in tiny glass jars. If each jar is to contain six cookies each, how
		 * many cookies will not be placed in a jar?
		 */
		int gingerBread = 47;
		int cookieJar = 6;
		int leftOvers = gingerBread % cookieJar;
		System.out.println(leftOvers + " " + "left over");
		/*
		 * 41. She also prepared 59 croissants which she plans to give to her 8
		 * neighbors. If each neighbor received and equal number of croissants,
		 * how many will be left with Marian?
		 */
		int crossants = 59;
		int neighbor = 8;
		int homelessCrossants = crossants % neighbor;
		System.out.println(homelessCrossants + " " + "crossants left");
		/*
		 * 42. Marian also baked oatmeal cookies for her classmates. If she can
		 * place 12 cookies on a tray at a time, how many trays will she need to
		 * prepare 276 oatmeal cookies at a time?
		 */
		int cookieTray = 12;
		int traysNeeded = 276 / cookieTray;
		System.out.println(traysNeeded + " " + "trays needed");
		/*
		 * 43. Marian’s friends were coming over that afternoon so she made 480
		 * bite-sized pretzels. If one serving is equal to 12 pretzels, how many
		 * servings of bite-sized pretzels was Marian able to prepare?
		 */
		int bitePretzel = 480;
		int biteServing = 12;
		int totalServings = bitePretzel / biteServing;
		System.out.println(totalServings + " " + "servings");
		/*
		 * 44. Lastly, she baked 53 lemon cupcakes for the children living in
		 * the city orphanage. If two lemon cupcakes were left at home, how many
		 * boxes with 3 lemon cupcakes each were given away?
		 */
		int cupcakes = 53 - 2;
		int boxedCupcakes = 3;
		int cupcakesGiven = cupcakes / boxedCupcakes;
		System.out.println(cupcakesGiven + " " + "boxes");
		/*
		 * 45. Susie's mom prepared 74 carrot sticks for breakfast. If the
		 * carrots were served equally to 12 people, how many carrot sticks were
		 * left uneaten?
		 */
		int carrots = 74;
		int people = 12;
		int carrotsLeft = carrots % people;
		System.out.println(carrotsLeft + " " + "left");
		/*
		 * 46. Susie and her sister gathered all 98 of their teddy bears and
		 * placed them on the shelves in their bedroom. If every shelf can carry
		 * a maximum of 7 teddy bears, how many shelves will be filled?
		 */
		int bears = 98;
		int shelfLimit = 7;
		int shelvesFilled = bears / shelfLimit;
		System.out.println(shelvesFilled + " " + "shelves needed");
		/*
		 * 47. Susie’s mother collected all family pictures and wanted to place
		 * all of them in an album. If an album can contain 20 pictures, how
		 * many albums will she need if there are 480 pictures?
		 */
		int photos = 480;
		int albumTotal = 20;
		int albumsNeeded = photos / albumTotal;
		System.out.println(albumsNeeded + " " + "albums");
		/*
		 * 48. Joe, Susie’s brother, collected all 94 trading cards scattered in
		 * his room and placed them in boxes. If a full box can hold a maximum
		 * of 8 cards, how many boxes were filled and how many cards are there
		 * in the unfilled box?
		 */
		int cardTotal = 94;
		int boxMax = 8;
		int boxTotal = cardTotal / boxMax;
		int cardsLeft = cardTotal % boxMax;
		System.out.println(cardsLeft + " " + "cards left");
		System.out.println(boxTotal + " " + "boxes needed");
		/*
		 * 49. Susie’s father repaired the bookshelves in the reading room. If
		 * he has 210 books to be distributed equally on the 10 shelves he
		 * repaired, how many books will each shelf contain?
		 */
		int books = 210;
		int repairedTotal = 10;
		int bookShelf = books / repairedTotal;
		System.out.println(bookShelf + " " + "per shelf");
		/*
		 * 50. Cristina baked 17 croissants. If she planned to serve this
		 * equally to her seven guests, how many will each have?
		 */
		int crossant = 17;
		int guests = 7;
		int crossantsServed = crossant / guests;
		System.out.println(crossantsServed + " " + "crossants each");
	}

}
