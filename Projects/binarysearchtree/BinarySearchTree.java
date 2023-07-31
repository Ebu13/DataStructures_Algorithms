public class BinarySearchTree {
    Node root;


    public void Insert(Node dugum, int deger)
    {
        Node newNode = new Node(deger);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            if(deger < dugum.value)
            {
                if(dugum.left == null)
                    dugum.left = newNode;
                else
                    Insert(dugum.left, deger);
            }
            else
            {
                if(dugum.right == null)
                    dugum.right = newNode;
                else
                    Insert(dugum.right, deger);
            }
        }
    }

    public void inord(Node dugum)
    {
        if(dugum != null)
        {
            inord(dugum.left);
            System.out.print(dugum.value);
            inord(dugum.right);
        }

    }

    public void PostOrder(Node dugum)
    {
        if(dugum != null)
        {

            PostOrder(dugum.left);
            PostOrder(dugum.right);
            System.out.print(dugum.value);

        }
    }

    public void PreOrder(Node dugum)
    {
        if(dugum != null)
        {

            System.out.print(dugum.value);
            PreOrder(dugum.left);
            PreOrder(dugum.right);

        }
    }

    public Node delete(Node parent, int key)
    {

        if(parent.left == null && parent.right == null)
            return null;

        else
        {
            if(parent.value < key)
            {
                parent.right = delete(parent.right, key);
                return null;
            }
            else if(parent.value > key)
            {
                parent.left = delete(parent.left,key);
                return null;
            }
            else
            {
                if(parent.left == null && parent.right == null)
                {
                    return null;
                }
                else if(parent.right != null)
                {
                    Node yeni = GetMinimumKey(parent.right, parent);
                    yeni.left = parent.left;
                    parent.left = null;
                    return yeni;
                }
                else
                {
                    return parent.left;
                }
            }
        }


    }

    public Node GetMinimumKey(Node node, Node parent)
    {
        if(node.left == null)
        {

            return node;
        }
        else
            return GetMinimumKey(node.left, node);
    }
}
