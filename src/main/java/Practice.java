public class Practice {
    Node head;
    Node tail;
    public Node addNode(int val){
        Node node=new Node(val);
        if (head==null){
            head=node;
            tail=node;
            return head;
        }
        tail.next=node;
        tail=tail.next;
        return head;
    }
    public static void main(String[] args) {
        Practice p=new Practice();

        p.addNode(1);
//        p.addNode(2);
        p.addNode(2);
//        p.addNode(3);
        p.addNode(3);
//        p.addNode(4);
        p.addNode(3);
        p.addNode(2);
        p.addNode(1);
        boolean reversedList=isPalindrome(p.head);
    }

    private static boolean isPalindrome(Node head) {
        if (head==null||head.next==null)return true;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        Node head1=head;
        slow.next=null;
        head2=reverse(head2);
        while(head2!=null){
            if(head1.val==head2.val){
                head1=head1.next;
                head2=head2.next;
            }else {
                return false;
            }
        }
        return true;
    }


    private static Node reverse(Node head) {
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node nextPtr=current.next;
            current.next=prev;
            prev=current;
            current=nextPtr;
        }
        return prev;

    }


}

class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
//========================reOrderList=======================================

//private static Node reOrderList(Node head) {
//        if (head==null|| head.next==null)return head;
//        Node slow=head;
//        Node fast=head;
//        while(fast.next!=null&& fast.next.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        Node head2=slow.next;
//        slow.next=null;
//        Node head1=head;
//        Node curr=new Node(-1);
//        head2=reverse(head2);
//        while(head1!=null){
//            Node temp=head1.next;
//            curr.next=head1;
//            head1.next=head2;
//            curr=head2;
//            head1=temp;
//            if (head2!=null)head2=head2.next;
//        }
//return head;
//    }


//==========================removr duplicates from list=======================

//    private static Node removeDuplicates(Node head) {
//        Node current=head;
//        Node dummy=new Node(-1);
//        dummy.next=head;
//        Node prev=dummy;
//        while(current!=null){
//            if (current.next!=null && current.val==current.next.val){
//                while(current.next!=null && current.val==current.next.val){
//                    current=current.next;
//                }
//                prev.next=current;
//                prev=current;
//            }
//            else {
//                prev=current;
//            }
//            current=current.next;
//        }
//        return dummy.next;
//    }



//==================================mergeTwoSortedLists========================================
//private static Node mergeTwoSortedList(Node head1, Node head2) {
//    Node l1=head1;
//    Node l2=head2;
//    Node dummyNode=new Node(-1);
//    Node dummy=dummyNode;
//    while(l1!=null && l2!=null){
//        if(l1.val<=l2.val){
//            dummy.next=l1;
//            l1=l1.next;
//        }else {
//            dummy.next=l2;
//            l2=l2.next;
//        }
//        dummy=dummy.next;
//    }
//    if (l1==null)dummy.next=l2;
//    if (l2==null)dummy.next=l1;
//    return dummyNode.next;
//}


//===========================reverseNodeInKGroups===============================================

//    private static Node reverseNodesInKGroups(Node head, int k) {
//        if (head==null || k==1)return head;
//        Node curr=head;
//        int count=k;
//        while (curr!=null&&count!=0){
//            count--;
//            curr=curr.next;
//        }
//        if (count>0)return head;
//        Node prev=reverseNodesInKGroups(curr,k);
//        Node currHead=head;
//        for (int i = 0; i < k; i++) {
//            Node nextPtr=currHead.next;
//            currHead.next=prev;
//            prev=currHead;
//            currHead=nextPtr;
//        }
//        return prev;
//    }

//================reverseList using pointers basic approach==============================================

//    private static Node reverseList(Node head) {
//        Node prev=null;
//        Node current=head;
//        while(current!=null){
//            Node nextNode=current.next;
//            current.next=prev;
//            prev=current;
//            current=nextNode;
//        }
//        return prev;
//    }

//====================reverse list using recursion without any class level variable===========
//{inside main method
//    Node reverseListNode=getReversedListUsingRecursion(p.head,null);
//}
//
//private static Node getReversedListUsingRecursion(Node head, Node newHead) {
//        if (head==null)return newHead;
//        Node nextHead=head.next;
//        head.next=newHead;
//        return getReversedListUsingRecursion(nextHead,head);
//        }



//===============================CREATE BST FROM SORTED ARRAY====================

// public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
//        Node root=getBSTFromSortedArray(arr,0,arr.length-1);
//    }
//
//    private static Node getBSTFromSortedArray(int[] arr, int low, int high) {
//        if(arr.length==0)return null;
//        if (low>high)return null;
//        int mid=low+(high-low)/2;
//
//        node.left=getBSTFromSortedArray(arr,low,mid-1);
//        node.right=getBSTFromSortedArray(arr,mid+1,high);
//        return node;
//    }
//}
//class Node{
//    int val;
//    Node left;
//    Node right;
//    Node(int val){
//        this.val=val;
//    }

//=============================find min on rotated sorted array======================
// public static void main(String[] args) {
//        int [] arr={4,5,6,7,2,1,0};
//        System.out.println(findMinimumValueInsideArray(arr));
//    }
//
//    private static int findMinimumValueInsideArray(int[] nums) {
//        int start=0;
//        int end= nums.length-1;
//        int min=Integer.MAX_VALUE;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            min=Math.min(min,nums[mid]);
//            if (nums[mid]>nums[end]){
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        return min;
//    }
//====================find index of target value inside rotated sorted array===========
//public static void main(String[] args) {
//        int [] arr={4,5,6,7,0,1,2};
//        System.out.println(getIndex(arr,2));
//    }
//
//    private static int getIndex(int[] arr, int target) {
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (arr[mid]==target)return mid;
//            if (arr[start]<arr[mid]){
//                if (target<arr[mid]&& target>=arr[start]){
//                    end=mid-1;
//                }else {
//                    start=mid+1;
//                }
//            }
//            else {
//                if (target>arr[mid]&& target<=arr[end]){
//                    start=mid+1;
//                }else {
//                    end=mid-1;
//                }
//
//            }
//        }
//        return -1;
//    }
//=============================Number of islands======================================
//public static void main(String[] args) {
//        int [][] grid={
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'}
//        };
//        System.out.println(getNomberOfIslands(grid));
//    }
//
//    private static int getNomberOfIslands(int[][] grid) {
//        int result=0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j]=='1'){
//                    dfs(grid,i,j);
//                    result++;
//                }
//            }
//
//        }
//        return result;
//    }
//
//    private static void dfs(int[][] grid, int i, int j) {
//        int H=grid.length;
//        int L=grid[0].length;
//        if (i<0||i>=H||j<0||j>=L||grid[i][j]!='1')return;
//        grid[i][j]='2';
//        dfs(grid,i+1,j);
//        dfs(grid,i-1,j);
//        dfs(grid,i,j+1);
//        dfs(grid,i,j-1);
//    }

//========================RAin water harvesting=======================================
// int [] heights={7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
//        int water=0;
//        int left=0;
//        int right=heights.length-1;
//        int maxLeft=heights[left];
//        int maxRight=heights[right];
//        while (left<right){
//            if (heights[left]<heights[right]){
//                left++;
//                maxLeft=Math.max(maxLeft,heights[left]);
//                water+=maxLeft-heights[left];
//            }else {
//                right--;
//                maxRight=Math.max(maxRight,heights[right]);
//                water+=maxRight-heights[right];
//            }
//        }
//        System.out.println(water);
//========================staircase problem===============================================================
// private static int getNumberOfWaysToClimbStaircase(int n) {
//        int[] temp=new int[n];
//        return helper(temp,0,n);
//    }
//
//    private static int helper(int[] temp, int i, int n) {
//        if (i==n)return 1;
//        if (i>n)return 0;
//        if (temp[i]>0)return temp[i];
//        temp[i]=helper(temp,i+1,n)+helper(temp,i+2,n);
//        return temp[i];
//    }

//===========================longest palindrome substring in given String===================================
//String str="""abbadba""";
//       int st=0;
//       int end=0;
//       if (str.length()<=1) System.out.println(str);
//       int maxLen=1;
////       for odd
//        for (int i = 0; i < str.length(); i++) {
//            int l=i;int r=i;
//            while (l>=0&& r<str.length()){
//                if(str.charAt(l)==str.charAt(r)){
//                    l--;
//                    r++;
//                }else break;
//            }
//            int len=r-l-1;
//            if (len>maxLen){
//                maxLen=len;
//                st=l+1;
//                end=r-1;
//            }
//
//        }
////        for even
//        for (int i = 0; i < str.length(); i++) {
//            int l=i;int r=i+1;
//            while (l>=0&& r<str.length()){
//                if(str.charAt(l)==str.charAt(r)){
//                    l--;
//                    r++;
//                }else break;
//            }
//            int len=r-l-1;
//            if (len>maxLen){
//                maxLen=len;
//                st=l+1;
//                end=r-1;
//            }
//
//        }
//        System.out.println(str.substring(st,end+1));
//    }
//=================================longest substring===============================
//String str="abcdefgabcde";
//    String test="";
//    int len=0;
//        for (int i = 0; i < str.length(); i++) {
//        if (test.contains(String.valueOf(str.charAt(i)))){
//        test=test.substring(test.indexOf(String.valueOf(str.charAt(i)))+1);
//        }
//        test= test.concat(String.valueOf(str.charAt(i)));
//        len=Math.max(len,test.length());
//        }
//        System.out.println(len);
//        System.out.println(test);

//==================================LIS===========================================
//int arr[]={1,3,5,7,2,4,6};
//        int ans=0;
//        int temp[]=new int[arr.length];
//        temp[0]=1;
//        for (int i = 1; i < arr.length; i++) {
//            int len=0;
//            for (int j = 0; j < i; j++) {
//                if (arr[j]<arr[i]){
//                    len=Math.max(len,temp[j]);
//                }
//            }
//            temp[i]=1+len;
//            ans=Math.max(ans,temp[i]);
//        }
//        System.out.println(ans);


//===================================LCS===========================================
// public static void main(String[] args) {
//        String s1="abcdefg";
//        String s2="abcdxfg";
//        int m=s1.length();
//        int n=s2.length();
//        int[][] myArr=new int[m+1][n+1];
//        for (int i = 1; i < myArr.length; i++) {
//            for (int j = 1; j < myArr[0].length; j++) {
//                if (s1.charAt(i-1)==s2.charAt(j-1)){
//                    myArr[i][j]=1+myArr[i-1][j-1];
//                }else{
//                    myArr[i][j]=Math.max(myArr[i-1][j],myArr[i][j-1]);
//                }
//            }
//
//        }
//        System.out.println(myArr[m][n]);
//    }

//================================Strategy design pattern===========================

//Sort sort;
//    Practice(Sort sort){
//        this.sort=sort;
//    }
//    public void myComplexMethod(int arr[]){
//        sort.mySorting(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        int[] a={4,2,7,3,6,1,5};
//        Practice p=new Practice(new Sort() {
//            @Override
//            public int[] mySorting(int[] arr) {
//                for (int i = 0; i < arr.length-1; i++) {
//                    for (int j = i+1; j < arr.length; j++) {
//                        if (arr[i]>arr[j]){
//                            int temp=arr[i];
//                            arr[i]=arr[j];
//                            arr[j]=temp;
//                        }
//                    }
//                }
//                return arr;
//            }
//        });
//        p.myComplexMethod(a);
//    }
//    interface Sort{
//        public int[] mySorting(int[] arr);
//    }

//======================================LRU=========================================

// int capacity;
//    Node headNode=new Node(0,0);
//    Node tailNode=new Node(0,0);
//    Map<Integer,Node> map=new HashMap<>(capacity);
//    Practice(int capacity){
//        this.capacity=capacity;
//        headNode.next=tailNode;
//        tailNode.prev=headNode;
//    }
//
//    public static void main(String[] args) {
//        Practice cache=new Practice(2);
//        cache.put(1,1);
//        cache.put(2,2);
//        System.out.println(cache.get(1));
//        cache.put(3,3);
//        System.out.println(cache.get(2));
//        cache.put(4,4);
//        System.out.println(cache.get(1));
//    }
//
//    private int get(int key) {
//        if (map.containsKey(key)){
//            Node node=map.get(key);
//            remove(node);
//            insert(node);
//            return node.val;
//        }
//        else {
//            return -1;
//        }
//
//    }
//
//    private void put(int key,int val) {
//        if (map.containsKey(key)){
//            remove(map.get(key));
//        }
//        if (map.size()==capacity){
//            remove(tailNode.prev);
//        }
//        insert(new Node(key,val));
//    }
//
//    private void insert(Node node) {
//        map.put(node.key,node);
//        Node headNext=headNode.next;
//        headNode.next=node;
//        node.next=headNext;
//        node.prev=headNode;
//        headNext.prev=node;
//    }
//
//    private void remove(Node node) {
//        map.remove(node.key);
//        node.prev.next=node.next;
//        node.next.prev=node.prev;
//    }
//
//
//    class Node{
//    int val;
//    int key;
//    Node next;
//    Node prev;
//    Node(int key,int val){
//        this.key=key;
//        this.val=val;
//    }
//}

//===================================Threadpool===================================================
//public static void main(String[] args) {
//        MyExecutorService service=new MythreadPoolExecutor(4);
//        for (int i = 0; i < 10; i++) {
//            service.submit(() -> {
//                System.out.println(Thread.currentThread().getName());
//            });
//        }
//    }

//interface MyExecutorService{
//    void submit(Runnable runnable);
//}
//class MythreadPoolExecutor implements MyExecutorService{
//    static int capacity;
//    static int current_capacity;
//    static LinkedBlockingQueue<Runnable> workerQueue;
//    Execution e;
//    MythreadPoolExecutor(int capacity){
//        this.capacity=capacity;
//        current_capacity=0;
//        workerQueue=new LinkedBlockingQueue<Runnable>();
//        e= new Execution();
//    }
//
//    @Override
//    public void submit(Runnable runnable) {
//        try {
//            workerQueue.put(runnable);
//        } catch (InterruptedException ex) {
//            throw new RuntimeException(ex);
//        }
//        e.executeMyMethod();
//    }
//}
//class Execution{
//    void executeMyMethod(){
//        if (MythreadPoolExecutor.current_capacity<MythreadPoolExecutor.capacity){
//            MythreadPoolExecutor.current_capacity++;
//            Thread t1=new Thread(()->{
//                while(true){
//                    if (MythreadPoolExecutor.workerQueue.size()!=0){
//                        MythreadPoolExecutor.workerQueue.poll().run();
//                    }
//                }
//            });
//            t1.start();
//        }
//    }
//}