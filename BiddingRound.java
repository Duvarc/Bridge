import java.util.ArrayList;

public class BiddingRound {

	private ArrayList<Bid> listOfBids;
	private int passCount;
	private Bid winningBid;

	public BiddingRound() {
		listOfBids = new ArrayList<Bid>(30);
		passCount = 0;
		winningBid = null;
	}

	public void addBid(Bid bid) {

		listOfBids.add(bid);

		//If bid is a pass
		if (bid.getRank() == 0) {
			passCount++;
		}

		if (passCount == 3) {
			winningBid = bid;
		}
	}


}