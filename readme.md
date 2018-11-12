This stuff take a graph in the form of an adjancency matrix or an adjacency list and does too things.  

First, it tells you if the graph is what's known as a YUCCA graph.  This means that there exists a node in the graph with directed edges to every other node, but edges directed to itself.  For example, if the graph has nodes A,B,C,D, and E, the graph would be YUCCA if A had edges to each of the other nodes but none of the nodes had an edge to it.  If there were no other edges besides A, the adjancecy matrix would look like 
      A B C D E
    A{0,1,1,1,1}
    B{0,0,0,0,0}
    C{0,0,0,0,0}
    D{0,0,0,0,0}
    E{0,0,0,0,0}

Notice how the row of node A has all 1's except for itself, and all of the numbers in its column are 0's.  This is important as it is how the program adjacency_matrix is able to tell if a graph is yucca or not.  

The second thing the program does is creates a graph based on the given list or matrix.  It uses a simple loop and the java package GraphStream to do this.   It's looks are basic and if you would like a better looking graph I would highly suggest checking out how GraphStream works yourself!  

yucca_graph.java has the code that creates two sample graphs, one is yucca and one is not.  

Lastly, the example graphs created are shown in png form.  