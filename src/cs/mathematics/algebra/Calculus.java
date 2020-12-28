/**
 * This file is part of CS. 
 * 
 * V:RD201228T125525
 */


package cs.mathematics.algebra;

public class Calculus {
	double D5, D4, D3, D2, D1, constant;
	
	public Calculus(double D5, double D4, double D3, double D2, double D1, double constant) {
		this.D5 = D5;
		this.D4 = D4;
		this.D3 = D3;
		this.D2 = D2;
		this.D1 = D1;
		this.constant = constant;
	}
	
	public Calculus(double D4, double D3, double D2, double D1, double constant) {
		this.D4 = D4;
		this.D3 = D3;
		this.D2 = D2;
		this.D1 = D1;
		this.constant = constant;
	}
	
	public Calculus(double D3, double D2, double D1, double constant) {
		this.D3 = D3;
		this.D2 = D2;
		this.D1 = D1;
		this.constant = constant;
	}
	
	public Calculus(double D2, double D1, double constant) {
		this.D2 = D2;
		this.D1 = D1;
		this.constant = constant;
	}
	
	public Calculus(double D1, double constant) {
		this.D1 = D1;
		this.constant = constant;
	}
	
	//
	//
	//
	
	private double innercal0(double coefficient, double x, double dim) {
		if(dim <= 0) {
			return 0;
		} else {
			double Idfx = coefficient*dim*Math.pow(x, dim -1);
			return Idfx;
		}
		
		//inner calculation for differentiate
	}
	
	private double innercal1(double coefficient, double x, double dim) {
		double Ifx = coefficient*Math.pow(x, dim);
		return Ifx;
		
		//inner calculation for normal
	}
	
	private double innercal2(double coefficient, double x, double dim) {
		double IFx = coefficient/(dim +1)*Math.pow(x, dim +1);
		return IFx;
		
		//inner calculation for indefinite integral
	}
	
	//
	//
	//
	
	public double dfx(double x) {
		double Ldfx = innercal0(this.D5, x, 5) + innercal0(this.D4, x, 4) + innercal0(D3, x, 3) + innercal0(D2, x, 2) + innercal0(D1, x, 1) + innercal0(constant, x, 0);
		return Ldfx;
		
		//calculation of differentiate
	}
	
	public double fx(double x) {
		double Lfx = innercal1(this.D5, x, 5) + innercal1(this.D4, x, 4) + innercal1(D3, x, 3) + innercal1(D2, x, 2) + innercal1(D1, x, 1) + innercal1(constant, x, 0);
		return Lfx;
		
		//calculation of normal function
	}
	
	public double Fx(double x) {
		double LFx = innercal2(this.D5, x, 5) + innercal2(this.D4, x, 4) + innercal2(D3, x, 3) + innercal2(D2, x, 2) + innercal2(D1, x, 1) + innercal2(constant, x, 0);
		return LFx;
		
		//calculation of indefinite integral
	}
	
	//
	//
	//
	
	public double Fx_C(double x, double C) {
		double FxC = innercal2(this.D5, x, 5) + innercal2(this.D4, x, 4) + innercal2(D3, x, 3) + innercal2(D2, x, 2) + innercal2(D1, x, 1) + innercal2(constant, x, 0) + C;
		return FxC;
		
		//..
	}
		
	public double def_integral(double x1, double x2) {
		double DI = Fx(x2) - Fx(x1);
		return DI;
		
		//calculation of definite integral
	}
	
	public double def_integral_2(double x1, double xm, double x2, double[] gx) {
		Calculus ICL = new Calculus(gx[0], gx[1], gx[2], gx[3], gx[4], gx[5]);
		
		double DI2 = def_integral(x1, xm) + ICL.def_integral(xm, x2);
		return DI2;
		
		//..
	}
	
	

}
