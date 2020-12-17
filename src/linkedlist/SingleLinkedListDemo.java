package linkedlist;

public class SingleLinkedListDemo {

    public static void main(String[] args) {

        SingleLinkedListDemo singleLinkedListDemo = new SingleLinkedListDemo();
        SingleLinkedList singleLinkedList = singleLinkedListDemo.new SingleLinkedList();


        singleLinkedList.addById(singleLinkedListDemo.new HeroNode(3,"three"));
        singleLinkedList.addById(singleLinkedListDemo.new HeroNode(2,"two"));
        singleLinkedList.addById(singleLinkedListDemo.new HeroNode(1,"one"));

        singleLinkedList.list();
        System.out.println("===============");

        singleLinkedList.reversetList(singleLinkedList.head);

        singleLinkedList.list();

//        singleLinkedList.update(singleLinkedListDemo.new HeroNode(4,"ooo"));
//
//        singleLinkedList.list();
//
//        singleLinkedList.delete(singleLinkedListDemo.new HeroNode(4,"ooo"));

    }

    class SingleLinkedList{
        private HeroNode head = new HeroNode(0,"");

        //往链表尾部添加
        public void add(HeroNode heroNode){

            HeroNode temp = head;
            while (true){
                if(temp.next == null){
                    temp.next = heroNode;
                    break;
                }
                temp = temp.next;
            }

        }

        //按id大小添加
        public void addById(HeroNode heroNode){

            HeroNode temp = head;
            while(true){
                if(temp.id == heroNode.id){
                    System.out.println("已存在");
                    break;
                }
                if(temp.next == null){
                    temp.next = heroNode;
                    break;
                }
                if(heroNode.id > temp.id && heroNode.id <temp.next.id){
                    heroNode.next = temp.next;
                    temp.next = heroNode;
                    break;
                }
                temp = temp.next;
            }

        }

        public void update(HeroNode heroNode){
            HeroNode temp = head;
            while(true) {

                if(temp == null){
                    System.out.println("先添加");
                    break;
                }
                if (temp.id == heroNode.id) {
                    temp.name = heroNode.name;
                    break;
                }

                temp = temp.next;
            }

        }

        public void delete(HeroNode heroNode){
            HeroNode temp = head;
            while(true){
                if(temp.next == null){
                    System.out.println("未找到");
                    break;
                }
                if(temp.next.id == heroNode.id){
                    temp.next = temp.next.next;
                    break;
                }

                temp = temp.next;
            }
        }

        //遍历
        public void list(){
            if(head.next == null){
                System.out.println("链表为空");
                return;
            }
            HeroNode temp = head.next;
            while(true){
                if(temp == null){
                    break;
                }
                System.out.println(temp);
                temp = temp.next;
            }
        }

        public void reversetList(HeroNode head){
            if(head.next == null || head.next.next == null)
                return;
            HeroNode heroNode1 = new HeroNode(0, "");
            HeroNode cur = head.next;
            HeroNode next = null;
            while(cur != null){
                next = cur.next;
                cur.next = heroNode1.next;
                heroNode1.next=cur;
                cur = next;
            }
            head.next = heroNode1.next;
        }

    }

    class HeroNode{
        public int id;
        public String name;
        public HeroNode next;

        public HeroNode(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }




}
