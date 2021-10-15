class cButton extends Canvas
        implements Runnable
{
    Image imgButtonUp;
    Image imgButtonDn;
    Container cont;
    int btnWidth;
    int btnHeight;
    Dimension dimMinSize;
    boolean bButtonUp = true;

    String btnTitle;

    Thread threadAnimate = null;
    Color clrTitleColor = Color.black;

    // ----------------------------------
    // Конструктор
    // ----------------------------------

    public cButton(Container parent,
                   Image imgUp, Image imgDn,
                   String btnTitle, int width, int height)
    {
    . . .
    }

    // ----------------------------------
    // Методы, возвращающие размеры кнопки
    // ----------------------------------

    public Dimension getPreferredSize()
    {
    . . .
    }
    public Dimension getMinimumSize()
    {
    . . .
    }
    public Dimension preferredSize()
    {
    . . .
    }
    public Dimension minimumSize()
    {
    . . .
    }

    // ----------------------------------
    // Метод paint
    // ----------------------------------

    public void paint(Graphics g)
    {
    . . .
    }

    // ----------------------------------
    // Метод для обработки событий от мыши
    // ----------------------------------

    public boolean mouseDown(
            Event ev, int x, int y)
    {
    . . .
    }
    public boolean mouseUp(
            Event ev, int x, int y)
    {
    . . .
    }
    public boolean mouseEnter(
            Event ev, int x, int y)
    {
    . . .
    }
    public boolean mouseExit(
            Event ev, int x, int y)
    {
    . . .
    }

    // ----------------------------------
    // Метод run для анимации
    // ----------------------------------

    public void run()
    {
    . . .
    }

    // ----------------------------------
    // Метод doButtonAction
    // ----------------------------------

    public void doButtonAction()
    {
    . . .
    }
}