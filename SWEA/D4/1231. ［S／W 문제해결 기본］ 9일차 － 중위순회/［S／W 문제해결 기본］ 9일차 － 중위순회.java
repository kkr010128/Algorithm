import java.util.Scanner;
// import java.io.FileInputStream;

class Solution {
    // 노드 클래스를 Solution 안에 중첩 클래스로 선언
    static class Node {
        char data;
        Node leftChild, rightChild;

        public Node(char data) {
            this.data = data;
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int testCase = 1; testCase <= 10; testCase++) { // 테스트케이스는 10개 제공됨
            int n = sc.nextInt();
            sc.nextLine(); // 개행 소비

            Node[] nodes = new Node[n + 1];

            // 각 노드의 정보를 입력받아 저장
            for (int i = 0; i < n; i++) {
                String[] line = sc.nextLine().split(" ");
                int nodeNum = Integer.parseInt(line[0]);
                char data = line[1].charAt(0);

                if (nodes[nodeNum] == null) {
                    nodes[nodeNum] = new Node(data);
                } else {
                    nodes[nodeNum].data = data;
                }

                // 왼쪽 자식이 있으면
                if (line.length >= 3) {
                    int leftIdx = Integer.parseInt(line[2]);
                    if (nodes[leftIdx] == null) {
                        nodes[leftIdx] = new Node(' ');
                    }
                    nodes[nodeNum].leftChild = nodes[leftIdx];
                }

                // 오른쪽 자식이 있으면
                if (line.length >= 4) {
                    int rightIdx = Integer.parseInt(line[3]);
                    if (nodes[rightIdx] == null) {
                        nodes[rightIdx] = new Node(' ');
                    }
                    nodes[nodeNum].rightChild = nodes[rightIdx];
                }
            }

            // 중위순회 결과 출력
            System.out.print("#" + testCase + " ");
            inorder(nodes[1]);
            System.out.println();
        }

        sc.close();
    }

    // 중위순회 (Left -> Root -> Right)
    static void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.leftChild); // 왼쪽 자식 방문
        System.out.print(node.data); // 현재 노드 출력
        inorder(node.rightChild); // 오른쪽 자식 방문
    }
}

// try {
// int numberInt = Integer.parseInt(numberString);
// System.out.println("The string is: " + numberString);
// System.out.println("The integer is: " + numberInt);
// } catch (NumberFormatException e) {
// System.out.println("Error: Could not convert the string to an integer.");
// System.out.println("Details: " + e.getMessage());
// }

// Parent i / 2
// Left_Child i * 2
// Right_Chile (i * 2) + 1

//

// 8 // 첫 번째 케이스의 N
// 1 W 2 3
// 2 F 4 5
// 3 R 6 7
// 4 O 8
// 5 T
// 6 A
// 7 E
// 8 S