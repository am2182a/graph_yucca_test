
public class Adjacency_Matrix {

	
	public static boolean isYucca(int[][] matrix) {
		boolean[] good_nodes = new boolean[matrix.length]; 
		System.out.println("  Adjacency matrix  ");
		System.out.println("---------------------");
		for(int i = 0; i<matrix.length;i++) {
			for(int j = 0; j<matrix[i].length;j++) 
				System.out.print(matrix[i][j] + " ");
			System.out.println("");
		}
		System.out.println("");
		for(int i = 0; i<matrix.length; i++) {
			boolean first_time= false; 
			for(int j=0; j<matrix[i].length;j++) {
				if (matrix[i][j] == 0 && first_time) {
					break; 
				}
				if (matrix[i][j] == 0) {
					first_time = true; 
				}
				if(matrix[i][j] == 1 && j == matrix[i].length - 1)
					good_nodes[i] = true; 
			}
		}
		
		for(int i = 0; i<good_nodes.length;i++) {
			if(good_nodes[i]) {
				for(int j = 0; j<matrix.length;j++) {
					if (matrix[j][i] == 1) {
						break; 
					}
					if (matrix[j][i] == 0 && j == matrix.length-1) {
						return true;
					}
				}
			}
		}
		
		
		return false; 
	}
	public static void main(String[] args) {
		
		int[][] yucca_matrix = new int[][] {
			{0,1,1,1,1,1},
			{0,0,1,0,1,0},
			{0,0,0,0,0,1},
			{0,1,0,0,0,0},
			{0,0,0,1,0,0},
			{0,0,1,0,0,0}
		};
	
		int[][] non_yucca_matrix = new int[][] {
			{0,0,1,0,1,0},
			{1,0,0,1,1,0},
			{0,0,0,0,0,1},
			{0,0,0,0,0,0},
			{0,0,0,0,0,1},
			{0,0,0,0,0,0}
		};
		
		
		System.out.println("First graph is YUCCA: " + isYucca(yucca_matrix) + "\n");
		
		System.out.println("Second graph is YUCCA: " + isYucca(non_yucca_matrix));
		
	}
}
