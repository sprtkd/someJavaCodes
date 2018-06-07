package com.sprtkd;

import java.io.IOException;
import java.util.ArrayList;

public class TowerOfHanoi {

	private class Instructions {
		int disknumber;
		int toPole;
		int fromPole;

		public Instructions(int disknumber, int fromPole, int toPole) {
			this.disknumber = disknumber;
			this.toPole = toPole;
			this.fromPole = fromPole;
		}
	}

	private int numOfDisks;
	private ArrayList<Integer> fromDisks;
	private ArrayList<Integer> toDisks;
	private ArrayList<Integer> spareDisks;
	private ArrayList<Instructions> listOfInstruct;

	private final int fromNum = 1;
	private final int toNum = 2;
	private final int spareNum = 3;

	public TowerOfHanoi(int numOfDisks) {

		// init
		this.numOfDisks = numOfDisks;
		fromDisks = new ArrayList<>();
		toDisks = new ArrayList<>();
		spareDisks = new ArrayList<>();

		listOfInstruct = new ArrayList<>();

		fillupBeginnerList();

		// generate
		generateListOfInstructions();

	}

	private void fillupBeginnerList() {
		int i;
		for (i = 1; i <= numOfDisks; i++) {
			fromDisks.add(i);
		}
	}

	private void generateListOfInstructions() {
		System.out.println("Please wait..Generating..");
		recurr(numOfDisks, fromNum, toNum, spareNum);
		System.out.println("Completed..");

	}

	private void recurr(int numOfDisks, int fromPole, int toPole, int sparePole) {
		if (numOfDisks == 1) {
			listOfInstruct.add(new Instructions(1, fromPole, toPole));
			return;
		}

		recurr(numOfDisks - 1, fromPole, sparePole, toPole);
		listOfInstruct.add(new Instructions(numOfDisks, fromPole, toPole));
		recurr(numOfDisks - 1, sparePole, toPole, fromPole);

		return;
	}

	private void nextStep(Instructions ins) throws Exception {
		int currDisk = ins.disknumber;
		int temp = 0;

		System.out.print("Instruction: Disk " + currDisk + " moved from ");

		switch (ins.fromPole) {
		case fromNum:
			temp = fromDisks.remove(0);
			System.out.print("\"FROM\" to ");
			break;
		case toNum:
			temp = toDisks.remove(0);
			System.out.print("\"TO\" to ");
			break;
		case spareNum:
			temp = spareDisks.remove(0);
			System.out.print("\"SPARE\" to ");
			break;
		}
		if (temp != currDisk)
			throw new Exception("Not Matching disk numbers! " + temp + " vs " + currDisk);

		switch (ins.toPole) {
		case fromNum:
			fromDisks.add(0, temp);
			System.out.println("\"FROM\"");
			break;
		case toNum:
			toDisks.add(0, temp);
			System.out.println("\"TO\"");
			break;
		case spareNum:
			spareDisks.add(0, temp);
			System.out.println("\"SPARE\"");
			break;
		}

	}

	private int max(int a, int b, int c) {
		if (a > b) {
			if (a > c)
				return a;
			else
				return c;
		} else {
			if (b > c)
				return b;
			else
				return c;
		}
	}

	private void promptEnterKey() {
		System.out.println("Press \"ENTER\" to continue...");
		try {
			System.in.read(new byte[2]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void draw() {
		int maxsize = max(fromDisks.size(), toDisks.size(), spareDisks.size());

		int i;
		System.out.println("------------------------------");
		for (i = 0; i < maxsize; i++) {
			if (i < fromDisks.size())
				System.out.printf("%8d", fromDisks.get(i));
			else
				System.out.print("\t-");

			if (i < toDisks.size())
				System.out.printf("%8d", toDisks.get(i));
			else
				System.out.print("\t-");

			if (i < spareDisks.size())
				System.out.printf("%8d", spareDisks.get(i));
			else
				System.out.print("\t-");

			System.out.println();
		}
		System.out.println("------------------------------");
		System.out.println("\tFROM |\tTO |\tSPARE");
		System.out.println("------------------------------");
		promptEnterKey();
	}

	public void simulate() {
		System.out.println(listOfInstruct.size() + " instructions in total");
		System.out.println("\t..Simulating..\n");
		draw();
		for (Instructions ins : listOfInstruct) {
			// System.out.println(ins.disknumber+" "+ins.fromPole+" "+ins.toPole);
			try {
				nextStep(ins);
			} catch (Exception e) {
				e.printStackTrace();
			}
			draw();
		}
	}

}
