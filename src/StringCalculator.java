public class StringCalculator {


    public int sum(String sequence) {
        int result = 0;
        String regex = ",|\\n";

        if (sequence.isEmpty()) {
            return 0;
        }

        if(sequence.startsWith("//")){
            String[] splitSequence = sequence.split("\n", 2);
            sequence = splitSequence[1];
            regex = splitSequence[0].substring(2);
            //regex = splitSequence[0].replace("//","");

        }

        String[] numbers = sequence.split(regex);

        for (String number : numbers) {
            result += Integer.parseInt(number);
        }

        return result;
    }
}
