/**
 * This file is part of CS. 
 * 
 * ----------
 * 
 * NOTE :
 * 
 * Range of base is UNUSUAL. 
 * 
 * Instead it follows: 
 * NEGATIVE_INFINITY < Base < POSITIVE_INFINITY (Base is real number)
 * 
 * ----------
 * 
 * V:RD200906T065839
 */

package cs.mathematics.algebra;

public class Baselog {
	
	public static double log(double base, double up) {
		double case_0 = Double.NaN;
		double case_1;
		double case_2;
		double Qbase = base * (-1);
		double Qup = up * (-1);
		
		if(base == 1 || base == -1 || (base == 0 && up == 0)) {
			return Double.POSITIVE_INFINITY;
		} else if(base == 0 && up != 0) {
			return Double.NaN;
		} else if(base > 0 && up > 0) {
			case_1 = Math.log10(up)/Math.log10(base);
			return case_1;
		} else if(base < 0 && up < 0) {
			case_1 = Math.log10(Qup)/Math.log10(Qbase);
			return case_1;
		} else if(base > 0 && up < 0) {
			return case_0;
		} else {
			case_2 = Math.log10(up)/Math.log10(Qbase);
			if(case_2 % 2 == 0) {
				case_1 = Math.log10(up)/Math.log10(Qbase);
				return case_1;
			} else {
				return case_0;
			}
		}
		
		
	}
	
	

}
