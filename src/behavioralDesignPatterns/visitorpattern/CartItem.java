package behavioralDesignPatterns.visitorpattern;

public interface CartItem {
    public void accept(ItemVisitor itemVisitor);
}
