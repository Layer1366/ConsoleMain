package com.neofleks.task1.consolemain;

import java.util.Scanner;

import com.neofleksjob.tasklibsearch.TaskLibSearch;
/**
 * Console task 1
 *
 */
public class ConsoleMain {

	public static void main(String args[]) {
		int num, item;

		Scanner input = new Scanner(System.in);
		System.out.println("Введите длину массива положительных целых чисел");
		num = input.nextInt();

		int[] arrayTaskFromBestKurator = new int[num];

		System.out.println("Введите " + num + " целых положительных чисел");

		for (int i = 0; i < num;) {
			if ((arrayTaskFromBestKurator[i] = input.nextInt()) >= 0) {
				i++;
			} else {
				System.out.println("Введено некорректное число");
			}
		}

		System.out.println("Введите число для поиска в массиве ");
		item = input.nextInt();
		input.close();

		TaskLibSearch.binarySearchArrayPositiveInteger(arrayTaskFromBestKurator, item);

	}
}
