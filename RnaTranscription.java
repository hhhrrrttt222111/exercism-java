class RnaTranscription {
    String transcribe(String dnaStrand) {
        return dnaStrand.replace('A', 'U')
            .replace('T', 'A')
            .replace('G', '#')
            .replace('C', 'G')
            .replace('#', 'C');
    }
}