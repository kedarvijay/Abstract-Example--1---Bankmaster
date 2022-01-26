package abs;

public final class IntrestCalculator {
		private int pamount;
		private float rate;
		private int term;
		public IntrestCalculator(int pamount, float rate, int term) {
			this.pamount = pamount;
			this.rate = rate;
			this.term = term;
		}
		public float intrAmount() {
			return (float)pamount*rate*term/100;
		}
		

	

}
