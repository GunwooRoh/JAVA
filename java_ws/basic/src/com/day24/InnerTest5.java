package com.day24;

public class InnerTest5 {

		class InstanceInner{}
		static class StaticInner{}
		
		public static void staticMethod() {
			//InstanceInner obj = new InstanceInner();
			StaticInner obj = new StaticInner();
		
		}
		
		public void istanceMethod() {
			InstanceInner obj = new InstanceInner();
			StaticInner obj2 = new StaticInner();
		}

		public static void main(String[] args) {
	}

}
