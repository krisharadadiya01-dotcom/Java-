class VotingApp {

    // Method to check voting eligibility
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        VotingApp voter = new VotingApp();

        // Different age inputs
        int[] ages = {16, 18, 25};

        for (int age : ages) {
            try {
                System.out.println("Checking age: " + age);
                voter.checkEligibility(age);
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } 
            finally {
                System.out.println("Validation process completed");
                System.out.println();
            }
        }
    }
}
