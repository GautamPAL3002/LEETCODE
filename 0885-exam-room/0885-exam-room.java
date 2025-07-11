class ExamRoom {
    private TreeSet<Integer> seats;
    private int N;

    public ExamRoom(int N) {
        this.N = N;
        seats = new TreeSet<>();
    }

    public int seat() {
        if (seats.isEmpty()) {
            seats.add(0);
            return 0;
        }

        int prev = -1;
        int maxDist = 0;
        int candidate = 0;

        for (int seat : seats) {
            if (prev == -1) {
                if (seat != 0 && seat > maxDist) {
                    maxDist = seat;
                    candidate = 0;
                }
            } else {
                int dist = (seat - prev) / 2;
                if (dist > maxDist) {
                    maxDist = dist;
                    candidate = prev + dist;
                }
            }
            prev = seat;
        }

        // Check end
        if (N - 1 - seats.last() > maxDist) {
            candidate = N - 1;
        }

        seats.add(candidate);
        return candidate;
    }

    public void leave(int p) {
        seats.remove(p);
    }
}
