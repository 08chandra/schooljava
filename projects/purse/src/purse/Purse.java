package purse;

import java.util.*;

public class Purse {
	ArrayList<String> coins = new ArrayList<>();

	void addCoin(String coinName) {
		coins.add(coinName);

	}

	void reverse() {
		ArrayList<String> tempCoins = new ArrayList<>();
		int reverseIndex = getCoins().size() - 1;
		for (int i = reverseIndex; i >= 0; i--) {
			tempCoins.add(getCoins().get(i));
		}
		setCoins(tempCoins);
	}

	public void transfer(Purse other) {
		getCoins().addAll(other.getCoins());
		other.getCoins().clear();
	}

	public boolean sameContents(Purse other) {
		ArrayList<String> otherCoins = other.getCoins();
		if (getCoins().size() != otherCoins.size()) {
			return false;
		}

		for (int i = 0; i < getCoins().size(); i++) {
			if (!getCoins().get(i).equals(otherCoins.get(i))) {

				return false;
			}
		}
		return true;

	}

	public boolean sameCoins(Purse other) {
		ArrayList<String> otherCoins = other.getCoins();
		if (getCoins().size() != otherCoins.size()) {
			return false;
		}

		for (int i = 0; i < getCoins().size(); i++) {
			if (!otherCoins.contains(getCoins().get(i))) {
				return false;
			}
		}
		return true;

	}

	public ArrayList<String> getCoins() {
		return coins;
	}

	public void setCoins(ArrayList<String> coins) {
		this.coins = coins;
	}

	public String toString() {
		String coinNames = "Purse[";
		for (String coin : coins) {
			coinNames += coin + ",";
		}
		coinNames += "]";
		return coinNames;

	}

}
