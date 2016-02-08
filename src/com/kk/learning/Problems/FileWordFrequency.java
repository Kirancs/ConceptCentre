package com.kk.learning.Problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class WordFrequency implements Comparable<WordFrequency> {

	public String word;
	public Integer wordFrequency;

	public WordFrequency(String word, int frequency) {
		this.word = word;
		this.wordFrequency = frequency;
	}

	@Override
	public int compareTo(WordFrequency wordObj) {
		// TODO Auto-generated method stub
		// return this.wordFrequency.compareTo(wordObj.wordFrequency);
		return wordObj.wordFrequency.compareTo(this.wordFrequency);
	}

	@Override
	public String toString() {
		return "WordFrequency [word=" + word + ", wordFrequency=" + wordFrequency + "]";
	}

}

class MinComparator implements Comparator<WordFrequency> {

	@Override
	public int compare(WordFrequency word1, WordFrequency word2) {
		// TODO Auto-generated method stub
		return word2.wordFrequency.compareTo(word1.wordFrequency);
	}

}

public class FileWordFrequency {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HashMap<String, Integer> wordMap = new HashMap<>();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("/Users/KK/Documents/misc/wordProblem.txt"));
			String currentLine;
			String[] wordsOfLine = null;

			while ((currentLine = br.readLine()) != null) {
				wordsOfLine = null;
				wordsOfLine = currentLine.split("\\W+");
				for (int i = 0; i < wordsOfLine.length; i++) {
					if (wordMap.get(wordsOfLine[i]) == null) {
						wordMap.put(wordsOfLine[i], 1);
					} else {
						wordMap.put(wordsOfLine[i], wordMap.get(wordsOfLine[i]) + 1);
					}

				}

				System.out.println(wordMap.toString());

			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("The file was not found");
		} finally {
			if (br != null) {
				br.close();
			}
		}

		int noOfValuesToPrint =5;
		printTopValuesFullHeap(noOfValuesToPrint, wordMap);
		printTopValuesMinHeap(noOfValuesToPrint, wordMap);

	}

	public static void printTopValuesMinHeap(int noOfValuesToPrint, HashMap<String, Integer> wordMap) {

		System.out.println("\nIn the method using Min Heap\n");
		PriorityQueue<WordFrequency> minQueue = new PriorityQueue<>(noOfValuesToPrint, new MinComparator());

		int counter = 0;
		for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			if (counter < noOfValuesToPrint) {
				minQueue.add(new WordFrequency(entry.getKey(), entry.getValue()));
			} else {
				if (minQueue.peek().wordFrequency < entry.getValue()) {
					minQueue.poll();
					minQueue.add(new WordFrequency(entry.getKey(), entry.getValue()));
				}
			}
			counter++;
		}
		int outputSize = (minQueue.size() < noOfValuesToPrint) ? minQueue.size() : noOfValuesToPrint;
		for (int i = 0; i < outputSize; i++) {
			System.out.println(minQueue.poll());
		}

	}

	public static void printTopValuesFullHeap(int noOfValuesToPrint, HashMap<String, Integer> wordMap) {

		System.out.println("\nIn the method using adding all variables to heap \n");
		PriorityQueue<WordFrequency> queue = new PriorityQueue<>();

		for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			queue.add(new WordFrequency(entry.getKey(), entry.getValue()));
		}
		/*
		 * for (String word : wordMap.keySet()) { queue.add(new
		 * WordFrequency(word, wordMap.get(word))); }
		 */
		int outputSize = (queue.size() < noOfValuesToPrint) ? queue.size() : noOfValuesToPrint;
		for (int i = 0; i < outputSize; i++) {
			System.out.println(queue.poll());
		}

	}

}
