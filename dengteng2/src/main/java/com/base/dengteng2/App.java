package com.base.dengteng2;

public class App {
	public static void main(String[] args) {
		double Vh = 1.0 / 720, Vm = 1.0 / 60, Vs = 1.0;
		int totalSec = 24 * 3600;
		int count = 0;
		for (int i = 0; i < totalSec; i++) {
			int Sh = (int) (Vh * i);
			int Sm = (int) (Vm * i);
			int Ss = (int) (Vs * i);
			if (Sh % 60 == Sm % 60 && Sh % 60 == Ss % 60) {
				int h = i / 3600;
				int m = (i - 3600 * h) / 60;
				int s = i - 3600 * h - 60 * m;
				String h1 = String.format("%02d", h);
				String m1 = String.format("%02d", m);
				String s1 = String.format("%02d", s);
				String str = h1 + ":" + m1 + ":" + s1;
				Long sdate = Long.parseLong(args[0].toString().replace(":", ""));
				Long edate = Long.parseLong(args[1].toString().replace(":", ""));
				Long time = Long.parseLong(str.replace(":", ""));
				if (time != 115959) {
					if (time >= sdate && time <= edate) {
						count++;
					}
				}
			}
		}
		System.out.println("时针、分针共有" + count + "次重合！");
	}
}
