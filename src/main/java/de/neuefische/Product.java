package de.neuefische;

public class Product {

    private String id;
    private String name;

    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (getId() != product.getId()) return false;
        return getName() != null ? getName().equals(product.getName()) : product.getName() == null;
    }

//    @Override
//    public String hashCode() {
//        String result = getId();
//        result = getId() + (getName() != null ? getName().hashCode() : 0);
//        return null;
//    }

    @Override
    public String toString() {
        return "\n Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
