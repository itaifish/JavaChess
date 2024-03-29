package main.java.game.moves;

public class PromotionMove extends Move{

	private final byte promotionId;

	public PromotionMove(final byte[] deltaPosition, final byte promotionId) {
		super(deltaPosition);
		this.setIsPromotionMove();
		this.promotionId = promotionId;
	}

	public byte promotionId() {
		return promotionId;
	}
}
