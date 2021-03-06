package com.lilithsthrone.game.character.race;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.lilithsthrone.game.character.GameCharacter;
import com.lilithsthrone.game.character.body.Body;
import com.lilithsthrone.game.character.body.Covering;
import com.lilithsthrone.game.character.body.types.BodyCoveringType;
import com.lilithsthrone.game.character.body.types.EarType;
import com.lilithsthrone.game.character.body.types.TailType;
import com.lilithsthrone.game.character.body.valueEnums.BodyMaterial;
import com.lilithsthrone.game.character.body.valueEnums.CoveringModifier;
import com.lilithsthrone.game.character.body.valueEnums.CoveringPattern;
import com.lilithsthrone.game.character.body.valueEnums.Height;
import com.lilithsthrone.utils.Colour;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.ListValue;
import com.lilithsthrone.world.WorldType;

/**
 * @since 0.1.91
 * @version 0.2.1
 * @author tukaima, Innoxia
 */
public enum Subspecies {

	// HUMAN:
	HUMAN("raceHuman",
			"human",
			"humans",
			"man",
			"woman",
			"men",
			"women",
			Race.HUMAN,
			Colour.RACE_HUMAN,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical human.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub

		}
	},

	// ANGEL:
	ANGEL("raceAngel",
			"angel",
			"angels",
			"angel",
			"angel",
			"angel",
			"angel",
			Race.ANGEL,
			Colour.RACE_ANGEL,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical angel.",
			Util.newArrayListOfValues()) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},

	// DEMON:
	DEMON("raceDemon",
			"demon",
			"demons",
			"incubus",
			"succubus",
			"incubi",
			"succubi",
			Race.DEMON,
			Colour.RACE_DEMON,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical demon.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public Subspecies getOffspringSubspecies() {
			return IMP;
		}
		
		@Override
		public String getOffspringMaleName() {
			return "imps";
		}
		@Override
		public String getOffspringMaleNameSingular() {
			return "imp";
		}
		@Override
		public String getOffspringFemaleName() {
			return "imps";
		}
		@Override
		public String getOffspringFemaleNameSingular() {
			return "imp";
		}
		
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},
	
	IMP("raceImp",
			"imp",
			"imps",
			"imp",
			"imp",
			"imps",
			"imps",
			Race.IMP,
			Colour.RACE_IMP,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical imp.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
		}
		@Override
		public boolean isShortStature() {
			return true;
		}
	},
	
	IMP_ALPHA("raceImpAlpha",
			"alpha-imp",
			"alpha-imps",
			"alpha-imp",
			"alpha-imp",
			"alpha-imps",
			"alpha-imps",
			Race.IMP,
			Colour.RACE_IMP,
			SubspeciesPreference.ONE_LOW,
			"A more powerful form of imp, standing at over 3'6\" tall.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public Subspecies getOffspringSubspecies() {
			return IMP;
		}
		@Override
		public void applySpeciesChanges(Body body) {
			body.setHeight(Height.NEGATIVE_ONE_TINY.getMedianValue());
		}
		@Override
		public boolean isShortStature() {
			return true;
		}
	},
	
	//LILIN(Race.LILIN.getName(), Race.DEMON, RacialBody.LILIN, SubspeciesPreference.ONE_MINIMAL,
	//		"A typical "+Race.LILIN.getName()),

	// BOVINES:
	COW_MORPH("raceCowMorph",
			"cow-morph",
			"cow-morphs",
			"cow-boy",
			"cow-girl",
			"cow-boys",
			"cow-girls",
			Race.COW_MORPH,
			Colour.RACE_COW_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal cow-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},
	//MINOTAUR(Race.MINOTAUR.getName(), Race.COW_MORPH, RacialBody.MINOTAUR, SubspeciesPreference.TWO_LOW,
	//		"An aggressive male-only variety of "+Race.COW_MORPH.getName()),
	
	// CANINES:
	DOG_MORPH("raceDogMorph",
			"dog-morph",
			"dog-morphs",
			"dog-boy",
			"dog-girl",
			"dog-boys",
			"dog-girls",
			Race.DOG_MORPH,
			Colour.RACE_DOG_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal dog-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
				@Override
				public void applySpeciesChanges(Body body) {
					// TODO Auto-generated method stub
				}
			},
	
	DOG_MORPH_DOBERMANN("raceDogMorphDobermann",
			"dobermann-morph",
			"dobermann-morphs",
			"dobermann",
			"dobermann",
			"dobermanns",
			"dobermanns",
			Race.DOG_MORPH,
			Colour.RACE_DOG_MORPH,
			SubspeciesPreference.TWO_AVERAGE,
			"A dog-morph which resembles an anthropomorphised dobermann. To be identified as a Dobermann, a character must be a dog-morph that has short, black fur, with either brown, dark-brown, or tan markings.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			Colour secondaryColour = Colour.COVERING_BROWN;
			double rand = Math.random();
			if(rand<0.3f) {
				secondaryColour = Colour.COVERING_TAN;
			} else if(rand<0.6f) {
				secondaryColour = Colour.COVERING_BROWN_DARK;
			}
			body.getCoverings().put(BodyCoveringType.CANINE_FUR, new Covering(BodyCoveringType.CANINE_FUR, CoveringPattern.MARKED, CoveringModifier.SHORT, Colour.COVERING_BLACK, false, secondaryColour, false));
			body.getCoverings().put(BodyCoveringType.HAIR_CANINE_FUR, new Covering(BodyCoveringType.CANINE_FUR, CoveringPattern.NONE, Colour.COVERING_BLACK, false, secondaryColour, false));
			body.getCoverings().put(BodyCoveringType.HUMAN, new Covering(BodyCoveringType.HUMAN, CoveringPattern.NONE, Colour.SKIN_EBONY, false, Colour.SKIN_EBONY, false));
			body.updateCoverings(true, true, true, true);
			if(body.getEar().getType()==EarType.DOG_MORPH) {
				body.getEar().setType(null, EarType.DOG_MORPH_POINTED);
			}
			if(body.getTail().getType()==TailType.DOG_MORPH) {
				body.getTail().setType(null, TailType.DOG_MORPH_STUBBY);
			}
		}
	},
	
	WOLF_MORPH("raceWolfMorph",
			"wolf-morph",
			"wolf-morphs",
			"wolf-boy",
			"wolf-girl",
			"wolf-boys",
			"wolf-girls",
			Race.WOLF_MORPH,
			Colour.RACE_WOLF_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal wolf-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},
	
	//FOX_MORPH(Race.FOX_MORPH.getName(), Race.FOX_MORPH, RacialBody.FOX_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.FOX_MORPH.getName()),
	// Kitsune have a separate racialbody than normal foxes but for subspecies preference purposes they should probably be considered the same as FOX_MORPH.
	// Just refer to the preferences for FOX_MORPH when building RacialSelectors instead of the preferences for KITSUNE.
	//FOX_TAILED("Pipefox", Race.FOX_MORPH, RacialBody.FOX_MORPH, SubspeciesPreference.TWO_LOW,
	//		"A "+Race.FOX_MORPH.getName()+" with a serpentine lower body, devoid of legs"),
	//FOX_TAUR("Yegan", Race.FOX_MORPH, RacialBody.FOX_MORPH, SubspeciesPreference.TWO_LOW,
	//		"A "+Race.FOX_MORPH.getName()+" with a bestial lower body that walks on four legs"),

	// FELINES:
	CAT_MORPH("raceCatMorph",
			"cat-morph",
			"cat-morphs",
			"cat-boy",
			"cat-girl",
			"cat-boys",
			"cat-girls",
			Race.CAT_MORPH,
			Colour.RACE_CAT_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal cat-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},

	// EQUINES:
	HORSE_MORPH("raceHorseMorph",
			"horse-morph",
			"horse-morphs",
			"horse-boy",
			"horse-girl",
			"horse-boys",
			"horse-girls",
			Race.HORSE_MORPH,
			Colour.RACE_HORSE_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal horse-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},

	REINDEER_MORPH("raceReindeerMorph",
			"reindeer-morph",
			"reindeer-morphs",
			"reindeer-boy",
			"reindeer-girl",
			"reindeer-boys",
			"reindeer-girls",
			Race.REINDEER_MORPH,
			Colour.RACE_REINDEER_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal reindeer-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},
	
	//CENTAUR(Race.CENTAUR.getName(), Race.HORSE_MORPH, RacialBody.CENTAUR, SubspeciesPreference.TWO_LOW,
	//		"A "+Race.HORSE_MORPH.getName()+" with a bestial lower body that walks on four legs"),

	// REPTILE:
	ALLIGATOR_MORPH("raceGatorMorph",
			"alligator-morph",
			"alligator-morphs",
			"alligator-boy",
			"alligator-girl",
			"alligator-boys",
			"alligator-girls",
			Race.ALLIGATOR_MORPH,
			Colour.RACE_ALLIGATOR_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal alligator-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},
	//LIZARD_MORPH(Race.LIZARD_MORPH.getName(), Race.LIZARD_MORPH, RacialBody.LIZARD_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.LIZARD_MORPH.getName()),
	//LAMIA(Race.LAMIA.getName(), Race.LIZARD_MORPH, RacialBody.LAMIA, SubspeciesPreference.TWO_LOW,
	//		"A "+Race.LIZARD_MORPH.getName()+" with a serpentine lower body, devoid of legs"),
	
	// AQUATIC:
	//SHARK_MORPH(Race.SHARK_MORPH.getName(), Race.SHARK_MORPH, RacialBody.SHARK_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.SHARK_MORPH.getName()),
	//TIGER_SHARK(Race.TIGER_SHARK.getName(), Race.TIGER_SHARK, RacialBody.TIGER_SHARK, SubspeciesPreference.FIVE_ABUNDANT,
	//		"An extremely aggressive variety of "+Race.SHARK_MORPH.getName()),
	
	// INSECTS:
	//BEE_MORPH(Race.BEE_MORPH.getName(), Race.BEE_MORPH, RacialBody.BEE_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.BEE_MORPH.getName()),
	//ROYAL_BEE(Race.ROYAL_BEE.getName(), Race.BEE_MORPH, RacialBody.ROYAL_BEE, SubspeciesPreference.ZERO_NONE,
	//		"A bipedal "+Race.BEE_MORPH.getName()+" at the top of the bee-morph hierarchy"),
	//WASP_MORPH(Race.WASP_MORPH.getName(), Race.WASP_MORPH, RacialBody.WASP_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.WASP_MORPH.getName()),
	
	// ARACHNIDS:
	//SPIDER_MORPH(Race.SPIDER_MORPH.getName(), Race.SPIDER_MORPH, RacialBody.SPIDER_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.SPIDER_MORPH.getName()),
	//ARACHNE(Race.ARACHNE.getName(), Race.SPIDER_MORPH, RacialBody.ARACHNE, SubspeciesPreference.TWO_LOW,
	//		"A "+Race.SPIDER_MORPH.getName()+" with an arachnid lower body that walks on eight legs"),
			
	// DRAGONS:
	//DRAGON(Race.DRAGON.getName(), Race.DRAGON, RacialBody.DRAGON, SubspeciesPreference.FOUR_HIGH,
	//		"A typical bipedal "+Race.DRAGON.getName()),
	//DRAGON_FUR("Fur "+Race.DRAGON.getName(), Race.DRAGON, RacialBody.DRAGON_FUR, SubspeciesPreference.ZERO_NONE,
	//		"A "+Race.DRAGON.getName()+" with a thick coat of fur, rather than scales"),
	//WYVERN(Race.WYVERN.getName(), Race.DRAGON, RacialBody.WYVERN, SubspeciesPreference.ONE_MINIMAL,
	//		"A bipedal "+Race.DRAGON.getName()+" with arms that act as wings"),
	//WYRM(Race.WYRM.getName(), Race.DRAGON, RacialBody.WYRM, SubspeciesPreference.ONE_MINIMAL,
	//		"A "+Race.DRAGON.getName()+" with a serpentine lower body, devoid of legs"),
	
	// SLIMES:
	SLIME("raceSlime",
			"slime",
			"slimes",
			"slime-boy",
			"slime-girl",
			"slime-boys",
			"slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical slime.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_ANGEL("raceSlime",
			"angel-slime",
			"angel-slimes",
			"angel-slime-boy",
			"angel-slime-girl",
			"angel-slime-boys",
			"angel-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of an angel.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.ANGEL, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_DEMON("raceSlime",
			"demon-slime",
			"demon-slimes",
			"demon-slime-boy",
			"demon-slime-girl",
			"demon-slime-boys",
			"demon-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a demon.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.DEMON, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_IMP("raceSlime",
			"imp-slime",
			"imp-slimes",
			"imp-slime-boy",
			"imp-slime-girl",
			"imp-slime-boys",
			"imp-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of an imp.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.IMP, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
		@Override
		public boolean isShortStature() {
			return true;
		}
	},
	SLIME_COW("raceSlime",
			"cow-slime",
			"cow-slimes",
			"cow-slime-boy",
			"cow-slime-girl",
			"cow-slime-boys",
			"cow-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a cow-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.COW_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_DOG("raceSlime",
			"dog-slime",
			"dog-slimes",
			"dog-slime-boy",
			"dog-slime-girl",
			"dog-slime-boys",
			"dog-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a dog-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.DOG_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_DOG_DOBERMANN("raceSlime",
			"dobermann-slime",
			"dobermann-slimes",
			"dobermann-slime-boy",
			"dobermann-slime-girl",
			"dobermann-slime-boys",
			"dobermann-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a dobermann-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.DOG_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_WOLF("raceSlime",
			"wolf-slime",
			"wolf-slimes",
			"wolf-slime-boy",
			"wolf-slime-girl",
			"wolf-slime-boys",
			"wolf-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a wolf-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.WOLF_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_CAT("raceSlime",
			"cat-slime",
			"cat-slimes",
			"cat-slime-boy",
			"cat-slime-girl",
			"cat-slime-boys",
			"cat-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a cat-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.CAT_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_HORSE("raceSlime",
			"horse-slime",
			"horse-slimes",
			"horse-slime-boy",
			"horse-slime-girl",
			"horse-slime-boys",
			"horse-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a horse-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.HORSE_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_REINDEER("raceSlime",
			"reindeer-slime",
			"reindeer-slimes",
			"reindeer-slime-boy",
			"reindeer-slime-girl",
			"reindeer-slime-boys",
			"reindeer-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a reindeer-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.REINDEER_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_ALLIGATOR("raceSlime",
			"alligator-slime",
			"alligator-slimes",
			"alligator-slime-boy",
			"alligator-slime-girl",
			"alligator-slime-boys",
			"alligator-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of an alligator-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.ALLIGATOR_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_SQUIRREL("raceSlime",
			"squirrel-slime",
			"squirrel-slimes",
			"squirrel-slime-boy",
			"squirrel-slime-girl",
			"squirrel-slime-boys",
			"squirrel-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a squirrel-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.SQUIRREL_MORPH, RaceStage.PARTIAL);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	SLIME_HARPY("raceSlime",
			"harpy-slime",
			"harpy-slimes",
			"harpy-slime-boy",
			"harpy-slime-girl",
			"harpy-slime-boys",
			"harpy-slime-girls",
			Race.SLIME,
			Colour.RACE_SLIME,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A slime that's taken on the form of a harpy-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.SUBMISSION))) {
		@Override
		public void applySpeciesChanges(Body body) {
//			body = CharacterUtils.generateBody(body.getGender(), Subspecies.HARPY, RaceStage.LESSER);
			body.setBodyMaterial(BodyMaterial.SLIME);
		}
	},
	
	
//	//SLIME_QUEEN(Race.SLIME_QUEEN.getName(), Race.SLIME, RacialBody.SLIME_QUEEN, SubspeciesPreference.ONE_MINIMAL,
//	//		"A female-only variety of "+Race.SLIME.getName()+" which "),
//	
//	// GARGOYLES:
//	GARGOYLE(Race.GARGOYLE.getName(), Race.GARGOYLE, RacialBody.GARGOYLE, SubspeciesPreference.FIVE_ABUNDANT,
//			"A typical "+Race.GARGOYLE.getName()),
//	GARGOYLE_CAT(Race.CAT_MORPH.getName()+" "+Race.GARGOYLE.getName(), Race.GARGOYLE, RacialBody.GARGOYLE_CAT, SubspeciesPreference.TWO_LOW,
//			"A "+Race.GARGOYLE.getName()+" resembling a typical bipedal "+Race.CAT_MORPH.getName()),
//	GARGOYLE_DOG(Race.DOG_MORPH.getName()+" "+Race.GARGOYLE.getName(), Race.GARGOYLE, RacialBody.GARGOYLE_DOG, SubspeciesPreference.TWO_LOW,
//			"A "+Race.GARGOYLE.getName()+" resembling a typical bipedal "+Race.DOG_MORPH.getName()),
//	GARGOYLE_WOLF(Race.WOLF_MORPH.getName()+" "+Race.GARGOYLE.getName(), Race.GARGOYLE, RacialBody.GARGOYLE_WOLF, SubspeciesPreference.TWO_LOW,
//			"A "+Race.GARGOYLE.getName()+" resembling a typical bipedal "+Race.WOLF_MORPH.getName()),
//	GARGOYLE_HORSE(Race.HORSE_MORPH.getName()+" "+Race.GARGOYLE.getName(), Race.GARGOYLE, RacialBody.GARGOYLE_HORSE, SubspeciesPreference.TWO_LOW,
//			"A "+Race.GARGOYLE.getName()+" resembling a typical bipedal "+Race.HORSE_MORPH.getName()),

	// RODENTS:
	SQUIRREL_MORPH("raceSquirrelMorph",
			"squirrel-morph",
			"squirrel-morphs",
			"squirrel-boy",
			"squirrel-girl",
			"squirrel-boys",
			"squirrel-girls",
			Race.SQUIRREL_MORPH,
			Colour.RACE_SQUIRREL_MORPH,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical bipedal squirrel-morph.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.DOMINION))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	},
	//MOUSE_MORPH(Race.MOUSE_MORPH.getName(), Race.MOUSE_MORPH, RacialBody.MOUSE_MORPH, SubspeciesPreference.FIVE_ABUNDANT,
	//		"A typical bipedal "+Race.MOUSE_MORPH.getName()),
	//RAT_MORPH(Race.RAT_MORPH.getName(), Race.MOUSE_MORPH, RacialBody.RAT_MORPH, SubspeciesPreference.TWO_LOW,
	//		"An extremely aggressive variety of "+Race.MOUSE_MORPH.getName()),

	// AVIAN:
	HARPY("raceHarpy",
			"harpy",
			"harpies",
			"harpy",
			"harpy",
			"harpies",
			"harpies",
			Race.HARPY,
			Colour.RACE_HARPY,
			SubspeciesPreference.FOUR_ABUNDANT,
			"A typical harpy.",
			Util.newArrayListOfValues(new ListValue<>(WorldType.HARPY_NEST))) {
		@Override
		public void applySpeciesChanges(Body body) {
			// TODO Auto-generated method stub
			
		}
	};
	//TENGU(Race.TENGU.getName(), Race.TENGU, RacialBody.TENGU, SubspeciesPreference.TWO_LOW,
	//		"A hermetic kind of "+Race.HARPY.getName());

	
	private String name, namePlural, singularMaleName, singularFemaleName, pluralMaleName, pluralFemaleName;
	private Race race;
	private Colour colour;
	private SubspeciesPreference subspeciesPreferenceDefault;
	private String description;
	protected String SVGString;
	private String SVGStringDesaturated;
	private List<WorldType> worldLocations;

	private Subspecies(
			String iconPathName,
			String name,
			String namePlural,
			String singularMaleName,
			String singularFemaleName,
			String pluralMaleName,
			String pluralFemaleName,
			Race race,
			Colour colour,
			SubspeciesPreference subspeciesPreferenceDefault,
			String description,
			List<WorldType> worldLocations) {
		
		this.name = name;
		this.namePlural = namePlural;

		this.singularMaleName = singularMaleName;
		this.singularFemaleName = singularFemaleName;
		
		this.pluralMaleName = pluralMaleName;
		this.pluralFemaleName = pluralFemaleName;
		
		this.race = race;
		this.colour = colour;
		this.subspeciesPreferenceDefault = subspeciesPreferenceDefault;
		this.description = description;
		
		this.worldLocations = worldLocations;
		
		if(iconPathName!=null) {
			try {
				InputStream is = this.getClass().getResourceAsStream("/com/lilithsthrone/res/statusEffects/" + iconPathName + ".svg");
				SVGString = Util.inputStreamToString(is);
	
				SVGString = SVGString.replaceAll("#ff2a2a", colour.getShades()[0]);
				SVGString = SVGString.replaceAll("#ff5555", colour.getShades()[1]);
				SVGString = SVGString.replaceAll("#ff8080", colour.getShades()[2]);
				SVGString = SVGString.replaceAll("#ffaaaa", colour.getShades()[3]);
				SVGString = SVGString.replaceAll("#ffd5d5", colour.getShades()[4]);
	
				is.close();
	
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				InputStream is = this.getClass().getResourceAsStream("/com/lilithsthrone/res/statusEffects/" + iconPathName + ".svg");
				SVGStringDesaturated = Util.inputStreamToString(is);
	
				SVGStringDesaturated = SVGStringDesaturated.replaceAll("#ff2a2a", Colour.BASE_GREY.getShades()[0]);
				SVGStringDesaturated = SVGStringDesaturated.replaceAll("#ff5555", Colour.BASE_GREY.getShades()[1]);
				SVGStringDesaturated = SVGStringDesaturated.replaceAll("#ff8080", Colour.BASE_GREY.getShades()[2]);
				SVGStringDesaturated = SVGStringDesaturated.replaceAll("#ffaaaa", Colour.BASE_GREY.getShades()[3]);
				SVGStringDesaturated = SVGStringDesaturated.replaceAll("#ffd5d5", Colour.BASE_GREY.getShades()[4]);
	
				is.close();
	
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			SVGString = "";
		}
	}

	public abstract void applySpeciesChanges(Body body);

	public static Subspecies getSubspeciesFromBody(Body body, Race race) {
		Subspecies subspecies = null;
		
//		switch(body.getBodyMaterial()) {
//			case FIRE:
//				break;
//			case FLESH:
//				break;
//			case ICE:
//				break;
//			case RUBBER:
//				break;
//			case SLIME:
//				return Subspecies.SLIME;
//		}
		
		if(subspecies==null) {
			switch(race) {
				case ALLIGATOR_MORPH:
					subspecies = Subspecies.ALLIGATOR_MORPH;
					break;
				case ANGEL:
					subspecies = Subspecies.ANGEL;
					break;
				case CAT_MORPH:
					subspecies = Subspecies.CAT_MORPH;
					break;
				case COW_MORPH:
					subspecies = Subspecies.COW_MORPH;
					break;
				case DEMON:
					subspecies = Subspecies.DEMON;
					break;
				case IMP:
					subspecies = Subspecies.IMP;
					if(body.getHeightValue()>Height.NEGATIVE_ONE_TINY.getMinimumValue()) {
						subspecies = Subspecies.IMP_ALPHA;
					}
					break;
				case DOG_MORPH:
					subspecies = Subspecies.DOG_MORPH;
					if(body.getCoverings().get(BodyCoveringType.CANINE_FUR).getPrimaryColour()==Colour.COVERING_BLACK
						&& (body.getCoverings().get(BodyCoveringType.CANINE_FUR).getSecondaryColour()==Colour.COVERING_BROWN
								|| body.getCoverings().get(BodyCoveringType.CANINE_FUR).getSecondaryColour()==Colour.COVERING_BROWN_DARK
								|| body.getCoverings().get(BodyCoveringType.CANINE_FUR).getSecondaryColour()==Colour.COVERING_TAN)
						&& body.getCoverings().get(BodyCoveringType.CANINE_FUR).getPattern() == CoveringPattern.MARKED
						&& body.getCoverings().get(BodyCoveringType.CANINE_FUR).getModifier() == CoveringModifier.SHORT
//						&& body.getEar().getType()==EarType.DOG_MORPH_POINTED
//						&& body.getTail().getType()==TailType.DOG_MORPH_STUBBY
						) {
						subspecies = Subspecies.DOG_MORPH_DOBERMANN;
					}
					break;
				case HARPY:
					subspecies = Subspecies.HARPY;
					break;
				case HORSE_MORPH:
					subspecies = Subspecies.HORSE_MORPH;
					break;
				case HUMAN:
					subspecies = Subspecies.HUMAN;
					break;
				case REINDEER_MORPH:
					subspecies = Subspecies.REINDEER_MORPH;
					break;
				case SQUIRREL_MORPH:
					subspecies = Subspecies.SQUIRREL_MORPH;
					break;
				case WOLF_MORPH:
					subspecies = Subspecies.WOLF_MORPH;
					break;
				case SLIME:
					subspecies = Subspecies.SLIME;
					switch(body.getRaceFromPartWeighting()) {
						case ALLIGATOR_MORPH:
							subspecies = Subspecies.SLIME_ALLIGATOR;
							break;
						case ANGEL:
							subspecies = Subspecies.SLIME_ANGEL;
							break;
						case CAT_MORPH:
							subspecies = Subspecies.SLIME_CAT;
							break;
						case COW_MORPH:
							subspecies = Subspecies.SLIME_COW;
							break;
						case DEMON:
							subspecies = Subspecies.SLIME_DEMON;
							break;
						case DOG_MORPH:
							if(body.getCoverings().get(BodyCoveringType.SLIME).getPrimaryColour()==Colour.SLIME_BLACK
									&& (body.getCoverings().get(BodyCoveringType.SLIME).getSecondaryColour()==Colour.SLIME_BROWN
											|| body.getCoverings().get(BodyCoveringType.SLIME).getSecondaryColour()==Colour.SLIME_BROWN_DARK
											|| body.getCoverings().get(BodyCoveringType.SLIME).getSecondaryColour()==Colour.SLIME_TAN)
									&& body.getCoverings().get(BodyCoveringType.SLIME).getPattern() == CoveringPattern.MARKED) {
								subspecies = Subspecies.SLIME_DOG_DOBERMANN;
							} else {
								subspecies = Subspecies.SLIME_DOG;
							}
							break;
						case HARPY:
							subspecies = Subspecies.SLIME_HARPY;
							break;
						case HORSE_MORPH:
							subspecies = Subspecies.SLIME_HORSE;
							break;
						case HUMAN:
							subspecies = Subspecies.SLIME;
							break;
						case IMP:
							subspecies = Subspecies.SLIME_IMP;
							break;
						case REINDEER_MORPH:
							subspecies = Subspecies.SLIME_REINDEER;
							break;
						case SLIME:
							subspecies = Subspecies.SLIME;
							break;
						case SQUIRREL_MORPH:
							subspecies = Subspecies.SLIME_SQUIRREL;
							break;
						case WOLF_MORPH:
							subspecies = Subspecies.SLIME_WOLF;
							break;
					}
					break;
			}
		}
		
		return subspecies;
	}
	
	public Subspecies getOffspringSubspecies() {
		return this;
	}
	
	public boolean isShortStature() {
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNamePlural() {
		return namePlural;
	}
	
	public String getSingularMaleName() {
		return singularMaleName;
	}

	public String getSingularFemaleName() {
		return singularFemaleName;
	}
	
	public String getPluralMaleName() {
		return pluralMaleName;
	}

	public String getPluralFemaleName() {
		return pluralFemaleName;
	}

	public String getOffspringMaleName() {
		return pluralMaleName;
	}
	public String getOffspringMaleNameSingular() {
		return singularMaleName;
	}
	
	public String getOffspringFemaleName() {
		return pluralFemaleName;
	}
	
	public String getOffspringFemaleNameSingular() {
		return singularFemaleName;
	}
	
	public Race getRace() {
		return race;
	}
	
	public Colour getColour() {
		return colour;
	}
	
	public SubspeciesPreference getSubspeciesPreferenceDefault() {
		return subspeciesPreferenceDefault;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getSVGString(GameCharacter character) {
		return SVGString;
	}
	
	public String getSVGStringDesaturated(GameCharacter character) {
		return SVGStringDesaturated;
	}

	public List<WorldType> getWorldLocations() {
		return worldLocations;
	}
}