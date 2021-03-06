package gui;

import java.awt.Color;

public class TileS extends Tile {

	private static TileS instance = null;

	public static TileS getInstance() {

		if (instance == null)
			instance = new TileS(new Color(COLOR_MIN, COLOR_MAX, COLOR_MIN), 3, 3, 2,
					new boolean[][] { { false, true, true, true, true, false, false, false, false, },
							{ false, true, false, false, true, true, false, false, true, },
							{ false, false, false, false, true, true, true, true, false, },
							{ true, false, false, true, true, false, false, true, false, } });

		return instance;
	}

	private TileS(Color color, int dimension, int cols, int rows, boolean[][] tiles) {
		super(color, dimension, cols, rows, tiles);
	}

}
