package eg.edu.alexu.csd.datastructure.linkedList.cs72_cs77;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		IPolynomialSolverr IPolynomialSolverr = new IPolynomialSolverr();
		System.out.println("______________________");
		System.out.println("1- Set a polynomial variable\r\n" + "2- Print the value of a polynomial variable\r\n"
				+ "3- Add two polynomials\r\n" + "4- Subtract two polynomials\n" + "5- Multiply two polynomials\r\n"
				+ "6- Evaluate a polynomial at some point\r\n" + "7- Clear a polynomial variable");
		System.out.println("=========================================================");
		System.out.println("Please choose an action:");

		int a;
		a = s.nextInt();

		while (a != 8) {

			if (a == 1) {
				System.out.println("Insert the variable name: A, B or C");
				char n;
				n = s.next().charAt(0);
				System.out.println("Insert the polynomial terms in the form:\r\n"
						+ "(coeff1, exponent1), (coeff2, exponent2), ..");

				String lx = s.next();
				int c = 0;
				for (int i = 0; i < lx.length(); i++) {
					if (lx.charAt(i) == '(') {
						c++;
					}
				}

				int[][] terms = new int[c][2];
				boolean negative;
				int k = 0, len = lx.length();
				for (int i = 0; i < c; i++) {
					for (int j = 0; j < 2; j++) {

						negative = false;
						for (; k < len; k++) {

							if (lx.charAt(k) == '-') {

								negative = true;
							}
							if (Character.isDigit(lx.charAt(k)) && Character.isDigit(lx.charAt(k + 1))
									&& Character.isDigit(lx.charAt(k + 2))) {

								terms[i][j] = Character.getNumericValue(lx.charAt(k)) * 100
										+ Character.getNumericValue(lx.charAt(k + 1)) * 10
										+ Character.getNumericValue(lx.charAt(k + 2));
								if (negative) {

									terms[i][j] = -terms[i][j];
								}
								k += 3;
								break;
							} else if (Character.isDigit(lx.charAt(k)) && Character.isDigit(lx.charAt(k + 1))) {

								terms[i][j] = Character.getNumericValue(lx.charAt(k)) * 10
										+ Character.getNumericValue(lx.charAt(k + 1));
								if (negative) {

									terms[i][j] = -terms[i][j];
								}
								k += 2;
								break;
							} else if (Character.isDigit(lx.charAt(k))) {

								terms[i][j] = Character.getNumericValue(lx.charAt(k));
								if (negative) {

									terms[i][j] = -terms[i][j];
								}
								k++;
								break;
							}
						}
					}
				}
				IPolynomialSolverr.Sort(terms);
				IPolynomialSolverr.setPolynomial(n, terms);
			}
			if (a == 2) {
				System.out.println("Insert the variable name: A, B or C : ");
				char n;
				n = s.next().charAt(0);
				String zz = IPolynomialSolverr.print(n);
				System.out.println(zz);
			}
			if (a == 3) {
				System.out.println("Insert the first operand variable name: A, B or C : ");
				char n1;
				n1 = s.next().charAt(0);
				System.out.println("Insert the Second operand variable name: A, B or C : ");
				char n;
				n = s.next().charAt(0);
				int add[][] = IPolynomialSolverr.add(n1, n);
				for (int i = 0; i < add.length; i++) {
					for (int j = 0; j < add[i].length; j++) {
						System.out.println(add[i][j]);
					}
				}
			}
			if (a == 4) {
				System.out.println("Insert the first operand variable name: A, B or C : ");
				char n1;
				n1 = s.next().charAt(0);
				System.out.println("Insert the Second operand variable name: A, B or C : ");
				char n;
				n = s.next().charAt(0);
				int SUB[][] = IPolynomialSolverr.subtract(n1, n);
				for (int i = 0; i < SUB.length; i++) {
					for (int j = 0; j < SUB[i].length; j++) {
						System.out.println(SUB[i][j]);
					}
				}
			}
			if (a == 5) {
				System.out.println("Insert the first operand variable name: A, B or C : ");
				char n1;
				n1 = s.next().charAt(0);
				System.out.println("Insert the Second operand variable name: A, B or C : ");
				char n;
				n = s.next().charAt(0);
				int mu[][] = IPolynomialSolverr.multiply(n1, n);
				for (int i = 0; i < mu.length; i++) {
					for (int j = 0; j < mu[i].length; j++) {
						System.out.println(mu[i][j]);
					}
				}
			}
			System.out.println("______________________");
			System.out.println("1- Set a polynomial variable\r\n" + "2- Print the value of a polynomial variable\r\n"
					+ "3- Add two polynomials\r\n" + "4- Subtract two polynomials\n" + "5- Multiply two polynomials\r\n"
					+ "6- Evaluate a polynomial at some point\r\n" + "7- Clear a polynomial variable");
			System.out.println("=========================================================");
			System.out.println("Please choose an action :");
			a = s.nextInt();
		}
		s.close();
	}

}