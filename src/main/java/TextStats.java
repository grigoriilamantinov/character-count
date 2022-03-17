public class TextStats {
    public void countWithArrayOnly(char[] charSourceArray) {
        int uniqueArrayIndex = 0;
        char[] uniqueArray = new char[charSourceArray.length];
        for (char element : charSourceArray) {

            int meetingCounter = 0;
            int uniqueMark = 0;

            uniqueArray[uniqueArrayIndex] = element;

            for (int i = 0; i < charSourceArray.length; i++) {
                if (element == charSourceArray[i]) {
                    meetingCounter++;
                }
            }

            for (int i = 0; i < uniqueArrayIndex+1; i++) {
                if (element == uniqueArray[i]) {
                    uniqueMark++;
                }
            }

            if (uniqueMark == 1) {
                System.out.println(charSourceArray[uniqueArrayIndex] + " : " + meetingCounter);
            }
            uniqueArrayIndex++;
        }
    }
}
//        Set<Character> uniqueCharSet = new HashSet<>();
//        for (Character element: charArray) {
//            uniqueCharSet.add(element);
//        }
//        System.out.println(uniqueCharSet);
//        for ()
////        String str = uniqueCharSet.;
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
