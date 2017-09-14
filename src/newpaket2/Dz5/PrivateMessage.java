package newpaket2.Dz5;

public class PrivateMessage extends Message {

    private User destinationUser;

    public User getDestinationUser() {
        return destinationUser;
    }

    public void setDestinationUser(User destinationUser) {
        this.destinationUser = destinationUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivateMessage)) return false;

        PrivateMessage that = (PrivateMessage) o;

        return getDestinationUser() != null ? getDestinationUser().equals(that.getDestinationUser()) : that.getDestinationUser() == null;
    }

    @Override
    public int hashCode() {
        return getDestinationUser() != null ? getDestinationUser().hashCode() : 0;
    }

    @Override
    public void send() {
        System.out.println("Отправлено сообщение пользователю " + destinationUser);
    }
}
