package com.day24;

public class InnerTest2 {

		private int outerIv = 10;
		private static int outerCv = 20;
		
		class InstanceInner {
			int iiv = outerIv;
			int iiv2 = outerCv;
		}
		
		static class StaticInner {
			static int scv = outerCv;
		}
		
		public void method() {
			int lv = 100;
			final int LV = 200;
			
			class LocalInner {
				int liv = outerIv;
				int liv2 = outerCv;
				
				int liv3 = lv;
				int liv4 = LV;
			}
		}
		public static void main(String[] args) {
	}

}
