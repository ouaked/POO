class Classroom {
    public static void main(String[] args) {
        Wilder prenom = new Wilder("Jean-Claude", true);
        Wilder prenom2 = new Wilder("Seb Dupuis", false);

        prenom.whoAmI();
        prenom2.whoAmI();
    }
}
