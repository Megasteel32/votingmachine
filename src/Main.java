public class Main {
    public static void main(String[] args) {
        VotingMachine machineOne = new VotingMachine();
        machineOne.voteDemocrat();
        VotingMachine.tallyVotes();
    }
}

class VotingMachine {

    static int democratCount;
    static int republicanCount;

    public void VotingMachine() {
    }

    public int getDemocratCount() {
        return democratCount;
    }

    public int getRepublicanCount() {
        return republicanCount;
    }

    public void voteDemocrat() {
        democratCount++;
    }

    public void voteRepublican() {
        republicanCount++;
    }

    static public void tallyVotes() {
        System.out.printf("Democrat Votes: %d\nRepublican Votes: %d\n", democratCount, republicanCount);
    }

    public void clearMachine() {
        republicanCount = 0;
        democratCount = 0;
    }

}