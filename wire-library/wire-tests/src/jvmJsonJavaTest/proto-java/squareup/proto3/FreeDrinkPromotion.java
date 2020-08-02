// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.FreeDrinkPromotion in pizza.proto
package squareup.proto3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class FreeDrinkPromotion extends Message<FreeDrinkPromotion, FreeDrinkPromotion.Builder> {
  public static final ProtoAdapter<FreeDrinkPromotion> ADAPTER = ProtoAdapter.newMessageAdapter(FreeDrinkPromotion.class, "type.googleapis.com/squareup.proto3.FreeDrinkPromotion", Syntax.PROTO_3);

  private static final long serialVersionUID = 0L;

  public static final Drink DEFAULT_DRINK = Drink.UNKNOWN;

  @WireField(
      tag = 1,
      adapter = "squareup.proto3.FreeDrinkPromotion$Drink#ADAPTER",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final Drink drink;

  public FreeDrinkPromotion(Drink drink) {
    this(drink, ByteString.EMPTY);
  }

  public FreeDrinkPromotion(Drink drink, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.drink = drink;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.drink = drink;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FreeDrinkPromotion)) return false;
    FreeDrinkPromotion o = (FreeDrinkPromotion) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(drink, o.drink);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (drink != null ? drink.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<FreeDrinkPromotion, Builder> {
    public Drink drink;

    public Builder() {
    }

    public Builder drink(Drink drink) {
      this.drink = drink;
      return this;
    }

    @Override
    public FreeDrinkPromotion build() {
      return new FreeDrinkPromotion(drink, super.buildUnknownFields());
    }
  }

  public enum Drink implements WireEnum {
    UNKNOWN(0),

    PEPSI(1),

    MOUNTAIN_DEW(2),

    ROOT_BEER(9);

    public static final ProtoAdapter<Drink> ADAPTER = ProtoAdapter.newEnumAdapter(Drink.class);

    private final int value;

    Drink(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static Drink fromValue(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return PEPSI;
        case 2: return MOUNTAIN_DEW;
        case 9: return ROOT_BEER;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
