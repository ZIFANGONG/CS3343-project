package gui;

import java.awt.Color;

public class TileI extends Tile {

	private static TileI instance = null;

	public static TileI getInstance() {

		if (instance == null)
			instance = new TileI(new Color(COLOR_MIN, COLOR_MAX, COLOR_MAX), 4, 4, 1,
					new boolean[][] {
							{ false, false, false, false, true, true, true, true, false, false, false, false, false,
									false, false, false, },
							{ false, false, true, false, false, false, true, false, false, false, true, false, false,
									false, true, false, },
							{ false, false, false, false, false, false, false, false, true, true, true, true, false,
									false, false, false, },
							{ false, true, false, false, false, true, false, false, false, true, false, false, false,
									true, false, false, } });

		return instance;
	}
	
	private TileI(Color color, int dimension, int cols, int rows, boolean[][] tiles) {
		super(color, dimension, cols, rows, tiles);
	}

}
