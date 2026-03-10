class Test {
    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is null");
        }
    }
}
// 1. They default to null because there is no object assigned to
// the variable yet.

// 2. When a variable is null, there is no object at all. When the
// object is empty, it exists but has no value.

// 3. Two variales can refer to the same object because they store
// references to the objects, not the objects themselves.

// 4. NullPointerException is caused by a variable being null when
// a piece of code is trying to use the object in the variable but
// there is nothing there.

// 5. Constructors often explicitly initialize object fields to
// prevent null problems.