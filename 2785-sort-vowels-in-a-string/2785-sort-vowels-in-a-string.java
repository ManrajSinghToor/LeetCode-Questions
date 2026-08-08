class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(c == 'a'|| c == 'e'|| c =='i'|| c == 'o'|| c == 'u'
            || c == 'A'|| c == 'I'|| c =='O'|| c == 'E'|| c == 'U'){
                list.add(c);
                sb.setCharAt(i, '#');
            }
        }
        if(list.size() == 0) return s;
        Collections.sort(list);
        int idx = 0;
        int i = 0;
        while(i < sb.length()){
            char ch = sb.charAt(i);
            if(idx < list.size() && ch == '#') {
                sb.setCharAt(i, list.remove(idx));
            }
            i++;
        }
        return sb.toString();
    }
}